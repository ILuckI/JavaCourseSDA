package EnumDemo;

public class Program {
    public static void main(String[] args) {

            ColorsEnum color;
            color = ColorsEnum.NIEBIESKI;

        switch (color) {
            case ZIELONY:
                System.out.println("Zielony!");
                break;
            case CZERWONY:
                System.out.println("Czerwony!");
                break;
            case NIEBIESKI:
                System.out.println("Niebieski!");
                break;
            default:
                System.out.println("Blad!");
        }


    }


}
