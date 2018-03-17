package Zajecia1003.Refleksja.DocumentZadanie;

import java.util.Date;

public class Document {
    private String[] authors;
    private Date date;
    private int counter=0;

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public Document(String[] authors) {
        this.authors = authors;
    }
}
