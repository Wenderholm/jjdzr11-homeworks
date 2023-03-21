package pl.isa.homeworks.zadanie2;

public class Movie extends CulturalPiece{

    public Movie(String title, String author) {
        super(title, author);
    }

    @Override
    public String[] getExperiences() {
        return new String[]{"listening", "watching"};
    }

    public String getCreatedBy(){
        return "Ceated by: " + author;
    }
}
