package Zadanie;

import java.util.Date;

public class EMail extends Document {
    private String subject;
    private String[] to;

    public EMail (String subject,String[] to , Date date){
        super(date);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }
}
