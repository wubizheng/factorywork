package com.gupao.factory.methodfactory;

import com.gupao.factory.Dog;
import com.gupao.factory.IAnimals;

public class DogFactory implements MethdAnimalFactory {

    public IAnimals createAnimal() {
        return new Dog();
    }
}
