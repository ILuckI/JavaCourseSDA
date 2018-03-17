package WczytanieLiter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ZliczLitery {
    public static void main(String[] args) {
        TreeMap<Character, Integer> hashMap = new TreeMap();
        File file = new File("C:\\Users\\Lenovo\\Desktop\\SDA\\Algorytmy\\src\\WczytanieLiter\\txt.txt");
        Scanner scanner=null;
        try {
          scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (scanner.hasNextLine()) {
            char[] chars = scanner.nextLine().toLowerCase().toCharArray();
            for (Character c : chars) {
                if(!Character.isLetter(c)){
                    continue;
                }
                else if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
