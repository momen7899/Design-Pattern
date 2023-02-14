package creational_patterns.abstract_factory_method.table;

public class VictorianTable implements Table {
    @Override
    public void hasTop() {
        System.out.println("Victorian Table has top");
    }
}
