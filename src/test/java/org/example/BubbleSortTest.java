package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BubbleSortTest {
    private BubbleSort bubbleSort;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream printStream = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
        bubbleSort = new BubbleSort(new int[]{});

    }

    @AfterEach
    void tearDown() {
        System.setOut(printStream);
    }

    @Test
    void testBubbleSort() {
        bubbleSort = new BubbleSort(new int[]{4, 1, 3, 9, 7});
        bubbleSort.sort();
        assertEquals("[1, 3, 4, 7, 9]", outputStream.toString().trim());
    }

    @Test
    void testBubbleSort2() {
        bubbleSort = new BubbleSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        bubbleSort.sort();
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", outputStream.toString().trim());
    }
}
