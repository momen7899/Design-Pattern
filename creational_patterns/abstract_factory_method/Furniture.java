package creational_patterns.abstract_factory_method;

import creational_patterns.abstract_factory_method.chair.Chair;
import creational_patterns.abstract_factory_method.factories.FurnitureFactory;
import creational_patterns.abstract_factory_method.table.Table;

public class Furniture {
    private final Chair chair;
    private final Table table;

    public Furniture(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void checkSafety() {
        chair.hasLegs();
        chair.sitOn();
        table.hasTop();
    }
}
