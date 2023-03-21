package pl.isa.homeworks.zadanie2;

import java.util.Collections;
import java.util.List;

public class CulturalPiecesApp {
    public static void main(String[] args) {
        List<CulturalPiece> culturalPieces = Collections.emptyList();

        // TODO: dodaj obiekty do listy culturalPieces

        for (CulturalPiece piece : culturalPieces) {
            System.out.println("Title: " + piece.getTitle());
            System.out.println(piece.getCreatedBy());
            System.out.println("It can be experienced by: " + String.join(", ", piece.getExperiences()));
        }
    }
}
