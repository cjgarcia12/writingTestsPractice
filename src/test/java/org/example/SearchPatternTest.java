package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchPatternTest {
    private SearchPattern searchPattern;
    private SearchPattern searchPattern2;

    @BeforeEach
    void setUp() {
        searchPattern = new SearchPattern("batmanandrobinarebat", "bat");
        searchPattern2 = new SearchPattern("abesdu", "edu");
    }

    @Test
    void testSearchPattern() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(18);
        assertEquals(result, searchPattern.search());
    }

    @Test
    void testSearchPattern2() {
        List<Integer> result = new ArrayList<>();
        assertEquals(result, searchPattern2.search());
    }
}
