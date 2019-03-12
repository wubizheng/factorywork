package com.gupao.factory.methodfactory;

import com.gupao.factory.Cat;
import com.gupao.factory.IAnimals;

public class CatFactory implements MethdAnimalFactory {
    public IAnimals createAnimal() {
        return new Cat();
    }
}
