package pl.isa.homeworks.zadanie2;

import java.util.List;
import java.util.Scanner;

public class AddCulturalPieceServices {
    public static Scanner sc = new Scanner(System.in);
    public static ExampleData exampleData = new ExampleData();
    public static List<CulturalPiece> culturalPieces = exampleData.getCulturalPieces();

    public static void showAllCulturalPieces() {
        for (CulturalPiece piece : culturalPieces) {
            System.out.println("Title: " + piece.getTitle());
            System.out.println(piece.getCreatedBy());
            System.out.println("It can be experienced by: " + String.join(", ", piece.getExperiences()));
            System.out.println("------------------------------");
        }
    }

    public static void addNewCulturalPieces() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while(isContinue) {
            showOptions();
            if(scanner.hasNextInt()){
                int userChoose = scanner.nextInt();
                switch (userChoose) {
                    case 1 -> addMovie();
                    case 2 -> addMusic();
                    case 3 -> isContinue = false;
                    default -> System.out.println("Choose the correct option");
                }
            }else{
                System.out.println("This is not a number ;)");
                scanner.nextLine();
            }
        }
    }

    public static void addMusic() {
        System.out.println("Enter song title: ");
        String title = sc.nextLine();
        System.out.println("Enter song author: ");
        String author = sc.nextLine();
        Music addMusic = new Music(title, author);
        ExampleData.culturalPieces.add(addMusic);
    }


    public static void addMovie() {
        System.out.println("Enter movie title: ");
        String title = sc.nextLine();
        System.out.println("Enter movie author");
        String author = sc.nextLine();
        Movie addMovie = new Movie(title, author);
        ExampleData.culturalPieces.add(addMovie);
    }

    private static void showOptions() {
        System.out.println("-------- ADDED MENU ---------");
        System.out.println("What do you want to do?");
        System.out.println("1 - Add Film");
        System.out.println("2 - Add Song");
        System.out.println("3 - The End. Return to MAIN MENU");
    }
}
