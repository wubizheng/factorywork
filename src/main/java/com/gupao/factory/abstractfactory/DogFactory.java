package com.gupao.factory.abstractfactory;

public class DogFactory implements AnimalFactory {
    public IBathe createIBathe() {
        return new DogBathe();
    }

    public IFeed createIFeed() {
        return new DogFeed();
    }
}
