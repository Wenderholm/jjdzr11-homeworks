package pl.isa.homeworks.zadanie1;

import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        Scanner input = new Scanner(System.in);

        System.out.println(game.getIntro());
        System.out.println("wybierz tryb gry wpisujac: STANDARD lub PLAYER");
        String gameMode = input.nextLine();
// PLAYER GAME MODE
        if (gameMode.equalsIgnoreCase("player")) {
            playerModeGame(game, input);
        }
// STANDARD GAME MODE
        while (game.isRunning()) {
            System.out.println(game.getInstruction());
            int number = checkCorrectInput(input);
            System.out.println(game.guessNumber(number));
        }
    }

    private static void playerModeGame(GuessNumberGame game, Scanner input) {
        System.out.println("podaj pirwsza liczbę zakresu");
        int min = checkCorrectInput(input);

        System.out.println("podaj drugą liczbę zakresu");
        int max = checkCorrectInput(input);
        if(max < min){
            System.out.println("podaj druga liczbę większą niż pierwsza");
            max = checkCorrectInput(input);
        }
        game.playerNumberToGuess(min, max);

        System.out.println("ile chcesz mieć szans na odgadnięcie");
        int numberOfChances = input.nextInt();

        while (game.isRunning()) {
            System.out.println(game.getPlayerInstruction(min, max));
            System.out.println("Masz " +  numberOfChances + " szans");
            int number = checkCorrectInput(input);
            numberOfChances--;
            System.out.println(game.guessPlayerNumber(number, numberOfChances));
        }
    }

    //    metoda sprawdza czy wprowadzone dane z Scannera są int
    private static int checkCorrectInput(Scanner input) {
        int number;
        do {
            while (!input.hasNextInt()) {
                System.out.println("To nie jest liczba");
                input.next();
            }
            number = input.nextInt();
        } while (number <= 0);
        return number;
    }
}
