package creational_patterns.abstract_factory_method.factories;

import creational_patterns.abstract_factory_method.chair.Chair;
import creational_patterns.abstract_factory_method.table.Table;

public interface FurnitureFactory {
    Chair createChair();

    Table createTable();
}
