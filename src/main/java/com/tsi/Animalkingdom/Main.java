package com.tsi.Animalkingdom;


public class Main {
    public static void main(String args[]) {
        Bat Vampire = new Bat();
        Vampire.name = "Vlad";
        Vampire.eat("blood");
        Vampire.setAge();
        System.out.println("This Bat is "+ Vampire.getAge());

    }
}