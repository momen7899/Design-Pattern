package creational_patterns.abstract_factory_method.table;

public class ModernTable implements Table{
    @Override
    public void hasTop() {
        System.out.println("Modern table has tops");
    }
}
