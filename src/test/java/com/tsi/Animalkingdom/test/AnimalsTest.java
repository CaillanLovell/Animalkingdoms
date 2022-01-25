package com.tsi.Animalkingdom.test;
import com.tsi.Animalkingdom.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {
    @Test
    public void testSize(){
        Bat testBat = new Bat();
        testBat.getSize();
        testBat.setSize();
        assertEquals(4, testBat.size, "The expected size fo the bat was wrong");
    }
    @Test
    public void testAge(){
        Bat testBat = new Bat();
        testBat.getAge();
        testBat.setAge();
        assertEquals(4, testBat.age, "The expected age fo the bat was wrong");
    }
    @Test
    public void testPoo(){
        Bat testBat = new Bat();
        testBat.excretion();
        assertEquals("I excreted", testBat.excretion(), "The bat does not excrete");
    }

    @Test
    public void testDiet(){
        Bat testBat = new Bat();
        testBat.eat("");
        assertEquals("I like to suck blood!", testBat.eat("blood"), "The bat does not excrete");
    }

    @Test
    public void testBaby(){
        Bat testBat = new Bat();
        testBat.Reproduction();
        assertEquals("Live birth", testBat.Reproduction(), "The bat does not excrete");
    }



}