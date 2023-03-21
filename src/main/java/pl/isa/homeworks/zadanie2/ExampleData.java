package pl.isa.homeworks.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class ExampleData {
    public static List<CulturalPiece> culturalPieces = new ArrayList<>();

    public List<CulturalPiece> getCulturalPieces() {
        return culturalPieces;
    }

    public void loadLocalData() {
        CulturalPiece cp1 = new Music("Shape of You", "Ed Sheeran");
        CulturalPiece cp2 = new Music("Blinding Lights", "The Weeknd");
        CulturalPiece cp3 = new Movie("Zielona Mila", "Frank Darabont");
        CulturalPiece cp4 = new Movie("Forrest Gump", "Robert Zemeckis");
        CulturalPiece cp5 = new Movie("Ojciec Chrzestny", "Francis Ford Coppola");

        culturalPieces.add(cp1);
        culturalPieces.add(cp2);
        culturalPieces.add(cp3);
        culturalPieces.add(cp4);
        culturalPieces.add(cp5);
    }
}