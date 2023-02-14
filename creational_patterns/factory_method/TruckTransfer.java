package creational_patterns.factory_method;

public class TruckTransfer extends Transfer{
    @Override
    public Logistic createLogistic() {
        return new Truck();
    }
}
