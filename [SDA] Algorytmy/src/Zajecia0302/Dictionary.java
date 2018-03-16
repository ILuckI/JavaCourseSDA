package Zajecia0302;

import java.util.HashMap;


public class Dictionary {
    public static void main(String[] args) {

        HashMap<Integer, String> dzieci = new HashMap<>();

        int test = 5;
        String testValue = "5555";
        dzieci.put(1,"Kowalski");
        dzieci.put(2,"Mialek");
        dzieci.put(test,testValue);
        dzieci.put(3,"No no noo noo");
        dzieci.put(4,"I co ?");

        System.out.println(dzieci.keySet());
        System.out.println(dzieci.values());

        String getDziecko = dzieci.get(1);
        System.out.println("");
        for (Integer key : dzieci.keySet()) {
            System.out.println(dzieci.get(key));
        }

        HashMap<Integer, String> szyfrCezara = new HashMap<>();
        szyfrCezara.put(0,"A");
        szyfrCezara.put(1,"B");
        szyfrCezara.put(2,"C");
        szyfrCezara.put(3,"D");
        szyfrCezara.put(4,"E");
        szyfrCezara.put(5,"F");
        szyfrCezara.put(6,"G");
        szyfrCezara.put(7,"H");
        szyfrCezara.put(8,"I");
        szyfrCezara.put(9,"J");
        szyfrCezara.put(10,"K");

        System.out.println(szyfrCezara.get(0+3));

    }
}
