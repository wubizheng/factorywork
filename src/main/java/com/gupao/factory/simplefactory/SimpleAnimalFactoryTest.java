package com.gupao.factory.simplefactory;

import com.gupao.factory.Cat;
import com.gupao.factory.IAnimals;

public class SimpleAnimalFactoryTest {
    public static void main(String[] args) {
        SimpleAnimalFactory simpleAnimalFactory=new SimpleAnimalFactory();
//        IAnimals iAnimals=simpleAnimalFactory.create(Dog.class);
          IAnimals iAnimals=simpleAnimalFactory.create(Cat.class);
          iAnimals.feed();
    }
}
