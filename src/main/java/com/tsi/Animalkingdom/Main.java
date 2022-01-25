package com.tsi.Animalkingdom;


public class Main {
    public static void main(String args[]) {
        Bat Vampire = new Bat(6,3);
        Vampire.name = "Vlad";
        Vampire.BatName();
        Vampire.eat("blood");
        Vampire.setAge();
        System.out.println("This Bat is "+ Vampire.getAge());

    }
}