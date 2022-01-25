package com.tsi.Animalkingdom.test;
import com.tsi.Animalkingdom.Animals;
import com.tsi.Animalkingdom.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {
    @Test
    public void testSize(){
        Bat testBat = new Bat();
        testBat.getSize();
        testBat.setSize();
        assertEquals(4, Animals.size, "The expected size of the bat was wrong");
    }
    @Test
    public void testAge(){
        Bat testBat = new Bat();
        testBat.getAge();
        testBat.setAge();
        assertEquals(4, Animals.age, "The expected age of the bat was wrong");
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
        testBat.Diet();
        assertEquals("I like to suck blood!", testBat.Diet(), "The bat does not excrete");
    }

    @Test
    public void testBaby(){
        Bat testBat = new Bat();
        testBat.Reproduction();
        assertEquals("Live birth", testBat.Reproduction(), "The bat does not excrete");
    }

    @Test
    public void testBat(){
        Bat testBat = new Bat();
        assertEquals("Vlad", testBat.BatName("Vampire"), "The bat is not Vlad");
        assertEquals("Peaches", testBat.BatName("Fruit"), "The bat is not Peaches");
    }

    @Test
    public void testSizegain(){
        Bat testBat = new Bat();
        testBat.getSize();
        testBat.setSize();
        testBat.eat();
        assertEquals(5, testBat.eat(), "The bat did not get bigger");
    }






 }





