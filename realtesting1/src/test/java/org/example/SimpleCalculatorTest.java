package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {
    SimpleCalculator sc = new SimpleCalculator();

    @Test
    void TinhTongTest() {
        assertEquals(4, sc.Cal(2, 2, "cong"));
    }

    @Test
    void TinhTruTest() {
        assertEquals(0, sc.Cal(2, 2, "tru"));
    }

    @Test
    void TinhNhanTest() {
        assertEquals(90, sc.Cal(10, 9, "nhan"));
    }

    @Test
    void TinhChiaTest() {
        assertEquals(4, sc.Cal(100, 25, "chia"));
    }

    @Test
    void TimHoaQuaTrongHopTest1() {
        assertEquals(true, sc.TimHoaQuaTrongHop("Orange"));
    }

    @Test
    void TimHoaQuaTrongHopTest2() {
        assertEquals(true, sc.TimHoaQuaTrongHop("Banana"));
    }

    @Test
    void TimHoaQuaTrongHopTest3() {
        assertEquals(true, sc.TimHoaQuaTrongHop("Apple"));
    }

    @Test
    void TimHoaQuaTrongHopTest4() {
        assertEquals(true, sc.TimHoaQuaTrongHop("Kiwi"));
    }
}





