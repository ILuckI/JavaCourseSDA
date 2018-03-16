package Zajecia0302.MyList;

public class Program {
    public static void main(String[] args) {
        MyList lista = new MyList();

        lista.addAtBeginnig(9);
        lista.addAtBeginnig(8);
        lista.addAtBeginnig(7);
        lista.addAtBeginnig(6);
        lista.addAtBeginnig(5);
        lista.addAtEnding(109);
        lista.addAtEnding(108);
        lista.addAtEnding(107);
        lista.addAtEnding(106);
        lista.addAtEnding(105);

        try {
            lista.addElementAfterElement(1000,107);
            lista.addElementAfterElement(1100,5);
        }
        catch (Exception e){
            e.getMessage();
        }
        try {
            lista.addElementBeforeElement(000,1000);
            lista.addElementBeforeElement(000,1100);
        }
        catch (Exception e){
            e.getMessage();
        }
        try {
            lista.deleteElement(1100);
            lista.deleteElement(1000);
            lista.deleteElement(5);
        }
        catch (Exception e){
            e.getMessage();
        }


        lista.printAll();
    }
}
