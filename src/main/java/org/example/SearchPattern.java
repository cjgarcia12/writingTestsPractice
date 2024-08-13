package org.example;

import java.util.ArrayList;
import java.util.List;

public class SearchPattern {

    private String text;
    private String pattern;

    public SearchPattern(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
    }

    public List<Integer> search() {
        List<Integer> result = new ArrayList<>();
        String combined = pattern + "$" + text;
        int n = combined.length();
        int[] Z = new int[n];

        // Z-array calculation
        int left = 0, right = 0;
        for (int i = 1; i < n; i++) {
            if (i > right) {
                left = right = i;
                while (right < n && combined.charAt(right) == combined.charAt(right - left)) {
                    right++;
                }
                Z[i] = right - left;
                right--;
            } else {
                int k = i - left;
                if (Z[k] < right - i + 1) {
                    Z[i] = Z[k];
                } else {
                    left = i;
                    while (right < n && combined.charAt(right) == combined.charAt(right - left)) {
                        right++;
                    }
                    Z[i] = right - left;
                    right--;
                }
            }
        }

        // Collect the results
        for (int i = 0; i < n; i++) {
            if (Z[i] == pattern.length()) {
                result.add(i - pattern.length() + 1);
            }
        }

        return result;
    }
}