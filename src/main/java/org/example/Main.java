package org.example;

import java.util.List;

public class Main {
    public static void bubbleSort() {
        // Example 1
        System.out.println("Example 1");
        int[] bubbleArray = {4, 1, 3, 9, 7};
        BubbleSort bubbleSort = new BubbleSort(bubbleArray);
        bubbleSort.sort();

        // Example 2
        System.out.println("\nExample 2");
        int[] bubbleArray1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort bubbleSort1 = new BubbleSort(bubbleArray1);
        bubbleSort1.sort();
    }

    public static void quickSort() {
        System.out.println("Example 1");
        int[] quickArray = {4, 1, 3, 9, 7};
        QuickSort quickSort = new QuickSort();
        String finalQuickSort = quickSort.sort(quickArray, 0, quickArray.length - 1);
        System.out.println(finalQuickSort);

        System.out.println("\nExample 2");
        int[] quickArray1 = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        QuickSort quickSort1 = new QuickSort();
        String finalQuickSort1 = quickSort1.sort(quickArray1, 0, quickArray1.length - 1);
        System.out.println(finalQuickSort1);
    }

    public static void countSort() {
        // Example 1
        CountSort cs1 = new CountSort("edsab");
        String result1 = cs1.sort();
        System.out.println(result1);

        // Example 2
        CountSort cs2 = new CountSort("geeksforgeeks");
        String result2 = cs2.sort();
        System.out.println(result2);
    }

    public static void seachPattern() {
        // Example 1
        SearchPattern sp1 = new SearchPattern("batmanandrobinarebat", "bat");
        List<Integer> result1 = sp1.search();
        System.out.println(result1); // Output: [1, 18]

        // Example 2
        SearchPattern sp2 = new SearchPattern("abesdu", "edu");
        List<Integer> result2 = sp2.search();
        System.out.println(result2); // Output: []

        // Converting to 1-based index for output clarity
        System.out.println("1-based index results:");
        for (int index : result1) {
            System.out.print((index + 1) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        bubbleSort();

        System.out.println("\nQuick Sort");
        quickSort();

        System.out.println("\nCount Sort");
        countSort();

        System.out.println("\nSeach Sort");
        seachPattern();
    }
}