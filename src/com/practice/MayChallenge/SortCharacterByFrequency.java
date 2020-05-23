package com.practice.MayChallenge;

public class SortCharacterByFrequency {
    public String frequencySort(String s) {
        if (s.length() == 0) return "";
        int[] map = new int[128];
        char[] result = new char[s.length()];
        char[] sList = s.toCharArray();
        for (char c : sList) {
            map[c] ++;
        }

        for (int i = 0 ; i < s.length();) {
            int max = 0;
            int index = 0;
            for (int j = 0 ; j < 128; j++) {
                if (map[j] > max) {
                    max = map[j];
                    index = j;
                }
            }

            while (map[index] > 0) {
                result[i++] = (char) index;
                map[index]--;
            }
        }
        return new String(result);
    }
}
