package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void calculateBMI() {
        assertEquals("Thiếu cân", BMI.calculateBMI(100,77));
    }
    @Test
    void calculateBMI2() {
        assertEquals("Béo phì", BMI.calculateBMI(1650,0));
    }
    @Test
    void calculateBMI3() {
        assertEquals("Bình thường", BMI.calculateBMI(2290,10));
    }
    @Test
    void calculateBMI4() {
        assertEquals("Thừa cân", BMI.calculateBMI(2490,10));
    }
}