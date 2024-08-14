package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    private QuickSort quickSort;
    private QuickSort quickSort2;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
        quickSort2 = new QuickSort();
    }

    @Test
    void testQuickSort() {
        int[] quickArray = {4, 1, 3, 9, 7};
        assertEquals("[1, 3, 4, 7, 9]", quickSort.sort(quickArray, 0, quickArray.length - 1));
    }

    @Test
    void testQuickSort2() {
        int[] quickArray = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        assertEquals("[1, 1, 2, 3, 4, 6, 7, 9, 10]", quickSort2.sort(quickArray, 0, quickArray.length - 1));
    }
}
