package com.bevia;

/**
 * Created by vincent on 9/2/16.
 */
public abstract class Animal {

    double area;

    static {
        System.out.println("hello here I am...");
    }

    public void makeNoise(){

        System.out.println("what noise do I make?");
    }

    public void eatFood(){

        System.out.println("what kind of food do I eat?");
    }

    public void habitat(){

        System.out.println("where do I live or dwell?");
    }

    public double area(double dim){

        return 0;
    }
}
