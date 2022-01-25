package com.tsi.Animalkingdom.test;
import com.tsi.Animalkingdom.Animals;
import com.tsi.Animalkingdom.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {
    @Test
    public void testSize(){
        Bat testBat = new Bat(Animals.size,Animals.age);
        assertEquals(4, testBat.getSize(), "The expected size fo the bat was wrong");
    }
    @Test
    public void testAge(){
        Bat testBat = new Bat(Animals.size, Animals.age);
        assertEquals(4, testBat.getSize(), "The expected size fo the bat was wrong");
    }
}