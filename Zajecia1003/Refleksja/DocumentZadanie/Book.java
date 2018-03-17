package Zajecia1003.Refleksja.DocumentZadanie;

public class Book extends Document {
    private String title;

    public Book(String[] authors, String title) {
        super(authors);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
