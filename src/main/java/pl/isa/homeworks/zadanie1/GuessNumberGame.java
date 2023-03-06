package pl.isa.homeworks.zadanie1;

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

    public String guessNumber(int number) {
        if (number > numberToGuess) {
            return "Szukana liczba jest mniejsza niż :" + number;
        }
        if (number < numberToGuess) {
            return "Szukana liczba jest większa niż :" + number;
        }
        hasWon = true;
        return "WYGRAŁEŚ";
    }


    public String guessPlayerNumber(int number, int numberOfChances) {
        if (numberOfChances > 0) {
            if (number > playerNumberGuess) {
                return "Szukana liczba jest mniejsza niż :" + number;
            }
            if (number < playerNumberGuess) {
                return "Szukana liczba jest większa niż :" + number;
            }
            if (number == playerNumberGuess) {
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
}
