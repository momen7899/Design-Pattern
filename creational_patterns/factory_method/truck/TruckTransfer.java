package creational_patterns.factory_method.truck;

import creational_patterns.factory_method.Logistic;
import creational_patterns.factory_method.Transfer;

public class TruckTransfer extends Transfer {
    @Override
    public Logistic createLogistic() {
        return new Truck();
    }
}
