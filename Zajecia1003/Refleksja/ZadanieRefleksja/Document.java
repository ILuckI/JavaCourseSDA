package Zajecia1003.Refleksja.ZadanieRefleksja;

import java.util.Date;

public class Document {
    private String[] autors = new String[10];
    private Date date;
    private int counter;

    public Document(String author, Date date){
        addAuthor(author);
        this.date = date;
    }

    public String[] getAuthors() {
        return autors;
    }

    public void addAuthor(String name){
        if(counter < 10){
            autors[counter] = name;
            counter++;
        }
    }

    public Date getDate() {
        return date;
    }
}
