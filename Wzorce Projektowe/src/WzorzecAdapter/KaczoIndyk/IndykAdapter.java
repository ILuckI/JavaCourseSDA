package WzorzecAdapter.KaczoIndyk;

public class IndykAdapter implements Kaczka {
    Indyk indyk;

    public IndykAdapter (Indyk indyk){
        this.indyk = indyk;

    }
    @Override
    public void kwacz() {
        indyk.gulgocz();
    }

    @Override
    public void lec() {
        indyk.lec();
    }
}
