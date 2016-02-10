package com.bevia;

/**
 * Created by vincent on 9/2/16.
 */
public class Dolphin extends Animal{

    public void makeNoise(){

        System.out.println("I make a pitch noise");
    }

    public void eatFood(){

        System.out.println("I eat other fish");
    }

    public void habitat(){

        System.out.println("I usually live in the ocean :)");
    }

    public String getMiId(){
        return "2883GH45";
    }

    public double area(double dim){

        area = dim * 106; //Square m of pond watter space

        return area;
    }
}
