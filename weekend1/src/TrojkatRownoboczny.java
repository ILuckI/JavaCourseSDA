public class TrojkatRownoboczny {
    public static void main(String[] args) {
        double a =3.0, b = 4.0, c = 5.0;
        double a2 = Math.pow(a,2.0);
        double b2 = Math.pow(b,2.0);
        double c2 = Math.pow(c,2.0);
        if (a2 + b2 == c2){
            System.out.println("Tak, mozna zdudowac kwadrat prostokatny!");
        }
        else if (b2 + c2 == a2){
            System.out.println("Tak, mozna zdudowac kwadrat prostokatny!");
        }
        else if (a2 + c2 == b2){
            System.out.println("Tak, mozna zdudowac kwadrat prostokatny!");
        }
        else{
            System.out.println("Niestety, twoj trojkat nie moze byc prostokatny");
        }
    }
}
