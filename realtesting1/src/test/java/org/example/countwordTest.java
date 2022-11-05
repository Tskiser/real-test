package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class countwordTest {

    @Test
    void count_Words() {assertAll(() -> assertEquals(1, countword.count_Words("mr")),
            () -> assertEquals(3, countword.count_Words("mr Bean eat")));
    }
    @Test
    void countspace(){
        assertEquals( 0, countword.count_Words("   "));
    }

}