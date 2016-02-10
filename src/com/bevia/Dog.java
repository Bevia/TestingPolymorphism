package com.bevia;

/**
 * Created by vincent on 9/2/16.
 */
public class Dog extends Animal{

    @Override
    public void makeNoise(){

        super.makeNoise();

        System.out.println("I bark");
    }

    @Override
    public void eatFood(){

        System.out.println("I love cookies");
    }


    public void DogIam(){

        System.out.println("Yes I'm a DOG :)");
    }



    public double area(double dim){

        area = dim * 3; // square m

        return area;
    }
}
