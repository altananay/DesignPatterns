package main;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    List<Observer> observers = new ArrayList<>();

    public void updatePrice()
    {
        System.out.println("Product price changed.");
        notification();
    }

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void detach(Observer observer)
    {
        observers.remove(observer);
    }

    private void notification()
    {
        for (Observer observer : observers)
        {
            observer.Update();
        }
    }

}
