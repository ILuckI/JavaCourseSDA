public class KwadratWpisanyWOkrag {
    public static void main(String[] args) {

        double bokKwadratu = 10.0;
        double promienKola = 50.0;
        double c = (bokKwadratu * Math.sqrt(2.0)) /2;

        if(bokKwadratu == c){
            System.out.println("Kwadrat mozna wpisac w okrag");
        }
        else {
            System.out.println("Kwadrat nie moze byc wspisany w okrag");
        }
    }
}
