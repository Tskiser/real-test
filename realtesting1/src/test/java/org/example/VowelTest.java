package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelTest {

    @Test
    void isVowel() { assertAll(() -> assertEquals(false, Vowel.isVowel('G')),
            () ->   assertEquals(false, Vowel.isVowel('B')),
            () -> assertEquals(true, Vowel.isVowel('U')));
    }
}