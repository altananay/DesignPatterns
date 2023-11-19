package main;

public class EmployeeObserver extends Observer {
    @Override
    public void Update() {
        System.out.println("Message to employee: Product price changed.");
    }
}
