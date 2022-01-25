package com.tsi.Animalkingdom;

public abstract class Mammal extends Animals{

    //////////////////////////////Attributes////////////////////////////////





    /////////////////////////////////Constructors//////////////////////////







    /////////////////////////////////Methods///////////////////////////////

    public Mammal(int size, int age) {
        super(size, age);
    }

    public String Breathing(){
        return "I breathe using lungs";
    }

    public String Reproduction(){
        return "I do not lay eggs";
    }

}