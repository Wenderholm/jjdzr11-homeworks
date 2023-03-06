package pl.isa.homeworks.zadanie1;

import java.util.Scanner;

import static pl.isa.homeworks.zadanie1.GuessNumberGame.checkCorrectInput;
import static pl.isa.homeworks.zadanie1.GuessNumberGame.playerModeGame;

public class GuessNumberApp {
    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        Scanner input = new Scanner(System.in);

        System.out.println(game.getIntro());
        String gameMode = input.nextLine();
// PLAYER GAME MODE
        if (gameMode.equalsIgnoreCase("player")) {
            playerModeGame(game, input);
        }
// STANDARD GAME MODE
        while (game.isRunning()) {
            System.out.println(game.getInstruction());
            int selectedNumber = checkCorrectInput(input);
            System.out.println(game.guessNumber(selectedNumber));
        }
    }

//
}
