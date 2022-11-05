package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class countVowelTest {

    @Test
    void count_Vowels() {
        assertAll(() -> assertEquals(4, countVowel.count_Vowels("toilaga")),
                () -> assertEquals(0, countVowel.count_Vowels("gtrfsd345")));
    }
    @Test
    void count_Vowels2() {
        assertEquals(5, countVowel.count_Vowels("toilaganha"));

    }
}