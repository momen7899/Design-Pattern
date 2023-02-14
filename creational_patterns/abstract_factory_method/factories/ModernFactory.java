package creational_patterns.abstract_factory_method.factories;

import creational_patterns.abstract_factory_method.chair.Chair;
import creational_patterns.abstract_factory_method.chair.ModernChair;
import creational_patterns.abstract_factory_method.table.ModernTable;
import creational_patterns.abstract_factory_method.table.Table;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
