package org.example;

public class CountSort {
    private final String arr;

    public CountSort(String arr) {
        this.arr = arr;
    }

    public String sort() {
        int[] count = new int[26];

        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'a']++;
        }

        StringBuilder sortedStr = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedStr.append((char)(i + 'a'));
                count[i]--;
            }
        }

        return sortedStr.toString();
    }
}
