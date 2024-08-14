package org.example;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSortTest {
    private CountSort countSort;
    private CountSort countSort2;

    @BeforeEach
    void setUp() {
        countSort = new CountSort("edsab");
        countSort2 = new CountSort("geeksforgeeks");
    }

    @Test
    void testCountSort() {
        assertEquals("abdes", countSort.sort());
        assertEquals("eeeefggkkorss", countSort2.sort());
    }
}
