package Zajecia1003.Refleksja.ZadanieRefleksja;

import java.util.Date;


public class Book extends Document {
private String title;



    public Book(String title,String autors, Date date) {
        super(autors,date);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }


}
