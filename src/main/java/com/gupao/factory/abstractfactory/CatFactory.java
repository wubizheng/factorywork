package com.gupao.factory.abstractfactory;

public class CatFactory implements AnimalFactory {
    public IBathe createIBathe() {
        return new CatBathe();
    }

    public IFeed createIFeed() {
        return new CatFeed();
    }
}
