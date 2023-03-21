package pl.isa.homeworks.zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CulturalPiecesApp {
    public static void main(String[] args) {
        List<CulturalPiece> culturalPieces = new ArrayList<>();


        // TODO: dodaj obiekty do listy culturalPieces
        CulturalPiece cp1 = new Music("Shape of You","Ed Sheeran");
        CulturalPiece cp2 = new Music("Blinding Lights","The Weeknd");
        CulturalPiece cp3 = new Movie("Zielona Mila", "Frank Darabont");
        CulturalPiece cp4 = new Movie("Forrest Gump", "Robert Zemeckis");
        CulturalPiece cp5 = new Movie("Ojciec Chrzestny", "Francis Ford Coppola");

        culturalPieces.add(cp1);
        culturalPieces.add(cp2);
        culturalPieces.add(cp3);
        culturalPieces.add(cp4);
        culturalPieces.add(cp5);

        for (CulturalPiece piece : culturalPieces) {
            System.out.println("Title: " + piece.getTitle());
            System.out.println(piece.getCreatedBy());
            System.out.println("It can be experienced by: " + String.join(", ", piece.getExperiences()));
            System.out.println("------------------------------");
        }
    }
}
