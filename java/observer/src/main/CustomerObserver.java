package main;

public class CustomerObserver extends Observer{
    @Override
    public void Update() {
        System.out.println("Message to customer: Product price changed.");
    }
}
