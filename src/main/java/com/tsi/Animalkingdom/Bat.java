package com.tsi.Animalkingdom;

public class Bat extends Mammal {
    public Bat() {

    }

    public String Diet() {
        return ("I like to suck blood!");
    }

    public String BatName(String species){

        String name = null;
        if (species.equals("Vampire")) {
            name = ("Vlad");
        }
        if (species.equals("Fruit")){
            name = ("Peaches");
        }

        return name;

    }

    public String Reproduction(){

        return "Live birth";
    }

    public String Warmblooded() {
        return "This is warm blooded";
    }


}
