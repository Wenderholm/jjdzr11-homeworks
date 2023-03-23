package pl.isa.homeworks.zadanie2;

public class Music extends CulturalPiece{
    public Music(String title, String author) {
        super(title, author);
    }

    @Override
    public String[] getExperiences() {
        return new String[]{"Listening"};
    }

    @Override
    public String getCreatedBy() {
        return "Composed by: " + author;
    }
}
