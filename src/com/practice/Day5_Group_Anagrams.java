package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Day5_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> groupAnagramsHashMap = new HashMap<>();
        for (String s : strs) {
            String str = sortString(s);
            if (!groupAnagramsHashMap.containsKey(str)) {
                groupAnagramsHashMap.put(str, new ArrayList<>());
            }
            groupAnagramsHashMap.get(str).add(s);
        }
        return new ArrayList(groupAnagramsHashMap.values());
    }

    public static String sortString(String inputString)
    {
        // convert input string to char array
        char[] tempArray = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
