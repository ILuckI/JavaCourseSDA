package Zajecia1003.Refleksja.ZadanieRefleksja;

import java.util.Date;

public class EMail extends Document {
    private String[] to;
    private String subject;


    public EMail(String[] to, String subject, String autor, Date date) {
        super(autor, date);
        this.to = to;
        this.subject = "";
    }

    public String[] getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
}
