package practice_HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map <String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        System.out.println("----------");
        Map <String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        treeMap.putAll(hashMap);
        System.out.println(treeMap);
        System.out.println("---------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
