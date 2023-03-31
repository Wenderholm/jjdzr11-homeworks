package pl.isa.homeworks.zadanie2;

import java.util.Scanner;

import static pl.isa.homeworks.zadanie2.AddCulturalPieceServices.addNewCulturalPieces;
import static pl.isa.homeworks.zadanie2.AddCulturalPieceServices.showAllCulturalPieces;


public class Menu {
    public void startMenu() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            showOptions();
            if (sc.hasNextInt()) {
                int userChoose = sc.nextInt();
                switch (userChoose) {
                    case 1 -> addNewCulturalPieces();
                    case 2 -> showAllCulturalPieces();
                    case 3 ->{
                        System.out.println("The program shuts down");
                        isContinue = false;
                    }
                    default -> System.out.println("Choose the correct option");
                }
            } else {
                System.out.println("This is not a number ;)");
                sc.nextLine();
            }
        }
    }

    private static void showOptions() {
        System.out.println("----- MAIN MENU --------");
        System.out.println("1 - Add new cultural piece");
        System.out.println("2 - Show actual cultural pieces");
        System.out.println("3 - End the program");
    }
}
