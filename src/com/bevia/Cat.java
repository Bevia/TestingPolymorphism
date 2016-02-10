package com.bevia;

/**
 * Created by vincent on 9/2/16.
 */
public class Cat extends Animal{

    @Override
    public void makeNoise(){

        System.out.println("I meauuu");
    }

    @Override
    public void eatFood(){

        System.out.println("I love fish");
    }

    public double area(double dim){

        area = dim * 8; // square m

        return area;
    }
}
