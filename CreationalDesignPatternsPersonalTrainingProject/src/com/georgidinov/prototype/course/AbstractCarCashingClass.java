package com.georgidinov.prototype.course;

import java.util.HashMap;
import java.util.Map;

class AbstractCarCashingClass {

    private static final Map<String, AbstractCar> carCashingMap = new HashMap<>();

    public static void loadData() {
        Ford ford = new Ford("Ford", 1234d);
        carCashingMap.put(ford.getName(), ford);

        Audi audi = new Audi("Audi", 4321d);
        carCashingMap.put(audi.getName(), audi);
    }//end if method loadData

    public static AbstractCar getClone(String cloneId) throws CloneNotSupportedException {
        AbstractCar cashedCar = carCashingMap.get(cloneId);
        return cashedCar.clone();
    }

}//end of class AbstractCarCashingClass
