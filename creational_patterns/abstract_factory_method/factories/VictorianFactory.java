package creational_patterns.abstract_factory_method.factories;

import creational_patterns.abstract_factory_method.chair.Chair;
import creational_patterns.abstract_factory_method.chair.VictorianChair;
import creational_patterns.abstract_factory_method.table.Table;
import creational_patterns.abstract_factory_method.table.VictorianTable;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
