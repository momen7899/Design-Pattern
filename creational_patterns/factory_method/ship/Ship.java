package creational_patterns.factory_method.ship;

import creational_patterns.factory_method.Logistic;

public class Ship implements Logistic {
    @Override
    public void load() {
        System.out.println("Ship load is done");
    }

    @Override
    public void transfer() {
        System.out.println("Ship transfer is done");
    }

    @Override
    public void delivery() {
        System.out.println("Ship delivery is done");
    }

}
