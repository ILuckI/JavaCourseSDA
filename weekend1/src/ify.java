public class ify {
    public static void main(String[] args) {

        int a = 1, b = 2;
        if (a > b) {
            System.out.println("Prawda");
        } else {
            System.out.println("Falsz");
        }

        int rok = 2012;
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0){
            System.out.println("Ten rok jest przystępny");
         }
        else{
            System.out.println("Rok nie jest przystepny");

        }
    }
}
