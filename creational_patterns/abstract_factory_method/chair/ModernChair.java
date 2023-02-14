package creational_patterns.abstract_factory_method.chair;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("modern chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("modern chair sit on");
    }
}
