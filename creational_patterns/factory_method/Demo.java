package creational_patterns.factory_method;

import creational_patterns.factory_method.truck.TruckTransfer;

public class Demo {

    public static void main(String[] args) {
        Transfer truckTransfer = new TruckTransfer();
        Transfer shipTransfer = new TruckTransfer();

        truckTransfer.deliverBox();
        shipTransfer.deliverBox();
    }
}
