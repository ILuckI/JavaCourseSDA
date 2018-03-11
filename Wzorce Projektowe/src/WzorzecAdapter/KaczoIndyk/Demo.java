package WzorzecAdapter.KaczoIndyk;

public class Demo {
    public static void main(String[] args) {
        Indyk indyk = new DzikiIndyk();
        Kaczka udawanaKaczka = new IndykAdapter(indyk);
        udawanaKaczka.kwacz();
        udawanaKaczka.lec();

    }
}
