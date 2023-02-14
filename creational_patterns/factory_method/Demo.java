package creational_patterns.factory_method;

public class Demo {

    public static void main(String[] args) {
        Transfer truckTransfer = new TruckTransfer();
        Transfer shipTransfer = new TruckTransfer();

        truckTransfer.deliverBox();
        shipTransfer.deliverBox();
    }
}
