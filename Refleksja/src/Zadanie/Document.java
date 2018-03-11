package Zadanie;

import java.util.Date;

public class Document {
    private String[] autors = new String[10];
    private Date date;
    private int counter;

    public Document(Date date) {
        this.date = date;
    }

    public String[] getAutors() {
        return autors;
    }

    public Date getDate() {
        return date;
    }

    public void addAuthor(String name) {
        if (counter < 10) {
            autors[counter] = name;
            counter++;
        }

    }
}
