package main;

public class AddedState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Added state");
        context.SetState(this);
    }
}
