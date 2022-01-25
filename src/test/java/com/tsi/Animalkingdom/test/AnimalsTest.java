package com.tsi.Animalkingdom.test;
import com.tsi.Animalkingdom.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {
    @Test
    public void testAge(){
        Bat testBat = new Bat(2,2);
        assertEquals(2, testBat.getSize(), "The expected weight of the Bat was wrong");
    }
}