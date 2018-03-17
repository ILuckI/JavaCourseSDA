package Zajecia1003.Refleksja.DocumentZadanie;

public class EMail extends Document {
    private String subject;
    private String[] to;

    public EMail(String[] authors) {
        super(authors);
    }

    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }
}
