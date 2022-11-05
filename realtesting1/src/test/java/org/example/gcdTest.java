package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gcdTest {

    @Test
  void  testGcd() {
        assertEquals(1, gcd.findgcd(3,1));

    }
    @Test
    void  testGcd2() {
        assertEquals(5, gcd.findgcd(10,15));

    }
    @Test
    void  testGcd3() {
        assertEquals(4, gcd.findgcd(8,12));

    }
}
