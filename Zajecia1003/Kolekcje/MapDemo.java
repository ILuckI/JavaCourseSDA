package Zajecia1003.Kolekcje;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //HashMap
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put(null,"Test");
        hashMap.put(null,null);
        hashMap.put("Test",null);
        //treeMap nie null
        TreeMap<String,String> treeMap=new TreeMap<>();
        treeMap.put(null,"Test");
        treeMap.put(null,null);
        treeMap.put("Test",null);
        //hashTable
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put(null,"Test");
        hashtable.put(null,null);
        hashtable.put("Test",null);
    }
}
