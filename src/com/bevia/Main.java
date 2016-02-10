package com.bevia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    //Testing:
    public static void main(String[] args) {

        List<Animal> listAreas = new ArrayList<>();
        double dim = 5.0;

        Animal animal = new Dog();
        animal.makeNoise();
        listAreas.add(animal);

        Dog boby = new Dog();
        boby.DogIam();

        animal = new Cat();
        animal.makeNoise();
        listAreas.add(animal);

        animal = new Dolphin();
        animal.makeNoise();
        listAreas.add(animal);

        System.out.println("the total area that I need is: " + getTotalArea(listAreas, dim) + " m");

    }

    public static double getTotalArea(List listAreas, double dim){

        Iterator it = listAreas.iterator();
        double totalArea = 0.0;
        while (it.hasNext()){
            Animal a = (Animal)it.next();
            totalArea += a.area(dim); //Polymorphic method call
        }

        return totalArea;
    }


}


