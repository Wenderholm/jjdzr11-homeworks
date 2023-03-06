package pl.isa.homeworks.zadanie1;

import java.util.Scanner;

public class GuessNumberGame {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 10;
    private int playerNumberGuess = 0;
    private boolean hasWon = false;
    private int numberToGuess = (int) (Math.random() * MAX_VALUE + 1);

    public String getIntro() {
        return
                """
                        !!!! The Best Guess Number Game Ever !!!!!
                         Zasady gry:
                         1. Wybierz tryb gry wpisująć PLAYER 
                         2. Wybierz tryb gry STANDARD wpisująć dowolna inna wartość niż PLAYER
                         2. STANDARD - gra będzie miała ustawiony przedział, limit szans jest nieograniczony
                         3. PLAYER - gracz ma możliość ustalenia:
                                - przedziału liczb;
                                - ilość możliwości zgadywnia; 
                        Wybierz rodzaj rozgrywki i ciesz się zabawą ;)
                        
                        Wybierz tryb gry wpisujac: STANDARD lub PLAYER
                        """;
    }

    public boolean isRunning() {
        if (hasWon) {
            return false;
        }
        return true;
    }

    public String getInstruction() {
        return "Podaj liczbę z przedziału " + MIN_VALUE + " - " + MAX_VALUE;
    }


    public String getPlayerInstruction(int min, int max) {
        return "Podaj liczbę z przedziału " + min + " - " + max;
    }

    public String guessNumber(int selectedNumber) {
        if (selectedNumber > numberToGuess) {
            return "Szukana liczba jest mniejsza niż :" + selectedNumber;
        }
        if (selectedNumber < numberToGuess) {
            return "Szukana liczba jest większa niż :" + selectedNumber;
        }
        hasWon = true;
        return "WYGRAŁEŚ";
    }


    public String guessPlayerNumber(int selectedNumber, int numberOfChances) {
        if (numberOfChances > 0) {
            if (selectedNumber > playerNumberGuess) {
                return "Szukana liczba jest mniejsza niż :" + selectedNumber;
            }
            if (selectedNumber < playerNumberGuess) {
                return "Szukana liczba jest większa niż :" + selectedNumber;
            }
            if (selectedNumber == playerNumberGuess) {
                hasWon = true;
                return "WYGRAŁES";
            }
        }
        hasWon = true;
        return "PORAŻKA";
    }

    public void playerNumberToGuess(int min, int max) {
        playerNumberGuess = (int) (min + (Math.random() * (max - min + 1)));
    }

    static void playerModeGame(GuessNumberGame game, Scanner input) {
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
            int selectedNumber = checkCorrectInput(input);
            if(selectedNumber >= min && selectedNumber <=max){
                numberOfChances--;
                System.out.println(game.guessPlayerNumber(selectedNumber, numberOfChances));
            }else {
                System.out.println("liczba z poza zakresu");
            }
        }
    }

    static int checkCorrectInput(Scanner input) {
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
