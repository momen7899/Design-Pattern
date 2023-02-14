package creational_patterns.factory_method.ship;

import creational_patterns.factory_method.Logistic;
import creational_patterns.factory_method.Transfer;

public class ShipTransfer extends Transfer {
    @Override
    public Logistic createLogistic() {
        return new Ship();
    }
}
