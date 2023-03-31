package pl.isa.homeworks.zadanie2;

public class CulturalPiecesApp {
    public static ExampleData exampleData = new ExampleData();

    public static void main(String[] args) {
        Menu menu = new Menu();
        exampleData.loadLocalData();
        menu.startMenu();
    }
}
