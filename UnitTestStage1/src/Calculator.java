public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public boolean evenNumber(double a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }
    public int fibonacci (int a){
        if (a == 0)
            return 0;
        else if (a == 1) {
            return 1;
        } else {
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }
    public int countTriple (String text){
        int results = 0;
        char[] textTab = text.toCharArray();
        for (int i = 0; i < textTab.length-2 ; i++) {
            if (textTab[i] == textTab[i+1] && textTab[i+1] == textTab[i+2] )
                results++;
          }
        return results;
    }
}
