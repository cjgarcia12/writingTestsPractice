package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void testGetMoney() {
        assertEquals(1000, player.getMoney());
    }

    @Test
    void testSetMoney() {
        player.setMoney(100);
        assertEquals(100, player.getMoney());
    }
}
