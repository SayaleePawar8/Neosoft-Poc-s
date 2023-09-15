package com.collections;
import java.util.concurrent.*;

public class ConcurrentHasmapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put(1, "Sayalee");
        concurrentMap.put(2, "Pawar");
        concurrentMap.put(3, "Sanjay");

        System.out.println("ConcurrentHashMap: " + concurrentMap);

       
        concurrentMap.put(2, "Renuka");
        System.out.println("Updated ConcurrentHashMap: " + concurrentMap);

        
        concurrentMap.remove(1);
        System.out.println("ConcurrentHashMap after removal: " + concurrentMap);

       
        System.out.println("Value for key 1: " + concurrentMap.get(1));
    }
}
