package abstrakcja;

public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println("Dziadzio krzyczy !");
    }
    public void zapalFaje(){
        System.out.println("Czy to weed ? Czy to tyton ? Dziadzio pali faje :)");
    }
}
