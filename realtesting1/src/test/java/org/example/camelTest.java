package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class camelTest {
    @Test
    void camelcase(){
        assertEquals("snakeCase", camel.toCamelCase("snake_case"));
    }
    @Test
    void camelcase2(){
        assertEquals("snakeCaseDog", camel.toCamelCase("snake_case_dog"));
    }


}