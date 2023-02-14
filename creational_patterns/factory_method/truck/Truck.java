package creational_patterns.factory_method.truck;

import creational_patterns.factory_method.Logistic;

public class Truck implements Logistic {

    @Override
    public void load() {
        System.out.println("Truck load is done");
    }

    @Override
    public void transfer() {
        System.out.println("Truck transfer is done");
    }

    @Override
    public void delivery() {
        System.out.println("Truck delivery is done");
    }
}