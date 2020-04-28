package com.practice;

import java.util.LinkedHashMap;

public class Day27_First_Unique_Number {
    LinkedHashMap<Integer, Boolean> uniqueList = new LinkedHashMap<>();
    public FirstUnique(int[] nums) {
        for (int num : nums) {
            if (!uniqueList.containsKey(num)) {
                uniqueList.put(num,true);
            } else if (uniqueList.get(num)){
                uniqueList.remove(num);
                uniqueList.put(num,false);
            }
        }
    }

    public int showFirstUnique() {
        if (uniqueList.size() > 0) {
            for (int key : uniqueList.keySet()) {
                if (uniqueList.get(key)) {
                    return key;
                }
            }
        }
        return -1;
    }

    public void add(int value) {
        if (!uniqueList.containsKey(value)) {
            uniqueList.put(value,true);
        } else if (uniqueList.get(value)){
            uniqueList.remove(value);
            uniqueList.put(value,false);
        }
    }
}
