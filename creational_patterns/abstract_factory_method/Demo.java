package creational_patterns.abstract_factory_method;

import creational_patterns.abstract_factory_method.factories.FurnitureFactory;
import creational_patterns.abstract_factory_method.factories.ModernFactory;
import creational_patterns.abstract_factory_method.factories.VictorianFactory;

public class Demo {

    private static Furniture configureFurniture() {
        FurnitureFactory factory;
        if (Math.random() >= 0.5d)
            factory = new ModernFactory();
        else
            factory = new VictorianFactory();

        return new Furniture(factory);
    }

    public static void main(String[] args) {
        Furniture furniture = configureFurniture();
        furniture.checkSafety();
    }

}
