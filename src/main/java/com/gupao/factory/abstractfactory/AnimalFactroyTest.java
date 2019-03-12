package com.gupao.factory.abstractfactory;

public class AnimalFactroyTest {
    public static void main(String[] args) {
      CatFactory catFactory=new CatFactory();
     IBathe iBathe= catFactory.createIBathe();
     iBathe.batche();
     IFeed iFeed= catFactory.createIFeed();
     iFeed.feed();

      DogFactory dogFactory=new DogFactory();
      dogFactory.createIBathe().batche();
      dogFactory.createIFeed().feed();
    }
}
