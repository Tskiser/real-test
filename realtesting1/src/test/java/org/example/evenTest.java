package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evenTest {

    @Test
    void isEven() {   assertAll(() -> assertEquals(1, even.isEven(4)),
            () -> assertEquals(0, even.isEven(3)));
    }

}