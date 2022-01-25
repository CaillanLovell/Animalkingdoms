package com.tsi.Animalkingdom;

public abstract class Animals {

    ////////////////////Attributes////////////////////////
    public static int age = 4;
    public static int size = 4;
    String name;


    ////////////////////Constructors//////////////////////


    ////////////////////Methods///////////////////////////




    public String excretion(){
        return "I excreted";
    }

    public int getAge (){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public int getSize (){
        return size;
    }

    public void setSize (){
        this.size = size;
    }

}
