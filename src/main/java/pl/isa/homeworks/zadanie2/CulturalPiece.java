package pl.isa.homeworks.zadanie2;

public abstract class CulturalPiece {
    protected String title;
    protected String author;

    protected CulturalPiece(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedBy() {
        return "Created by: " + author;
    }

    public abstract String[] getExperiences();
}
