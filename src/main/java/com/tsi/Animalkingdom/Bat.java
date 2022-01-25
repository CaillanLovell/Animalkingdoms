package com.tsi.Animalkingdom;

public class Bat extends Mammal {
    public Bat(int size, int age) {
        super(size, age);
    }

    public void eat(String food)
    {
        System.out.println("I like to suck blood!");
    }

    public void BatName()
    {
        System.out.println("My name is "+ name);
    }


}
