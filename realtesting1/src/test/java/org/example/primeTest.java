package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class primeTest {

    @Test
    void isPrimeNumber() {
        assertEquals( true, prime.isPrimeNumber(2));
    }
    @Test
    void isPrimeNumber2() {
        assertEquals( false, prime.isPrimeNumber(1));
    }
    @Test
    void isPrimeNumber3() {
        assertEquals( false, prime.isPrimeNumber(0));
    }
}