package creational_patterns.factory_method;

public abstract class Transfer {
    public void deliverBox() {
        Logistic logistic = createLogistic();
        logistic.load();
        logistic.transfer();
        logistic.delivery();
    }

    protected abstract Logistic createLogistic();
}
