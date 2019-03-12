package com.gupao.factory.simplefactory;

import com.gupao.factory.IAnimals;

public class SimpleAnimalFactory {
    public IAnimals create(Class <? extends IAnimals> clazz){
      try {
          if (clazz != null) {
              IAnimals iAnimals = clazz.newInstance();
              return iAnimals;
          }
      }catch (Exception e){
          e.printStackTrace();
      }
     return null;
    }
}
