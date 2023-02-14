package creational_patterns.factory_method;

public class ShipTransfer extends Transfer {
    @Override
    public Logistic createLogistic() {
        return new Ship();
    }
}
