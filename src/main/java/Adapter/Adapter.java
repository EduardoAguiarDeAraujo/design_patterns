package Adapter;

public class Adapter implements Target {

    protected Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
