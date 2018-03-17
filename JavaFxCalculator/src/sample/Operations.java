package sample;

public enum Operations {
    ADD("+"),
    MINUS("-"),
    DIV("/"),
    MULT("*");

    // tworzenie prywatnego stringa do enuma ()
    private String operationChar;

    // tworzenie konstruktora ktory ustawia wartosci w () enuma
    Operations(String operationChar){
        this.operationChar = operationChar;
    }
    // metoda do wczytywanie wartosci w () - char
    private String getOperationChar(){
        return this.operationChar;
    }
    // w Enumach wszytkie publiczne metody musza byc statyczne
    // public typu Operations(Enum) szukane po Stringu
    public static Operations getOperation(String operationChar){
        for (Operations operations : Operations.values()) {
            if (operations.getOperationChar().equals(operationChar))
                return operations;

        }
    return Operations.ADD;
    }
}
