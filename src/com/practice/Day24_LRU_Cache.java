package com.practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day24_LRU_Cache {
    Map<Integer, Integer> list = new LinkedHashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = list.remove(key);
        if (value == null) {
            return -1;
        }
        list.put(key, value);
        return value;
    }
    public void put(int key, int value) {
        if (list.containsKey(key)) {
            list.remove(key);
        } else if (list.size() == capacity) {
            Iterator<Map.Entry<Integer, Integer>> iterator = list.entrySet().iterator();
            if (iterator.hasNext()){
                iterator.next();
                iterator.remove();
            }
        }
        list.put(key, value);
    }
}
