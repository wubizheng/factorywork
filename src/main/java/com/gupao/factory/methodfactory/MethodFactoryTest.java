package com.gupao.factory.methodfactory;

import com.gupao.factory.IAnimals;

public class MethodFactoryTest {
    public static void main(String[] args) {
        CatFactory catFactory=new CatFactory();
       IAnimals iAnimals= catFactory.createAnimal();
        iAnimals.feed();

        DogFactory dogFactory=new DogFactory();
        iAnimals=dogFactory.createAnimal();
        iAnimals.feed();
    }
}
