package com.practice.MayChallenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day5_First_Unique_Character_In_String {
    public static int firstUniqChar(String s) {
        if (s.length() == 0) return -1;
        int length = s.length();
        LinkedHashMap<Character, Integer> uniqList = new LinkedHashMap<>();
        Map<Character, Integer> sequenceList = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (sequenceList.containsKey(c)) {
                uniqList.remove(c);
            } else {
                uniqList.put(c, i);
                sequenceList.put(c, 1);
            }
        }
        for (char key : uniqList.keySet()) {
            return uniqList.get(key);
        }
        return -1;

        //BETTER SOLUTION
        //public int firstUniqChar(String s) {
        //        int res = Integer.MAX_VALUE;
        //
        //        for(char c = 'a'; c <= 'z'; c++){
        //            int index = s.indexOf(c);
        //
        //            if(index != -1 && index == s.lastIndexOf(c))
        //                res = Math.min(res, index);
        //        }
        //
        //        return res == Integer.MAX_VALUE ? -1 : res;
        //    }
    }
}
