package main;

public class ModifiedState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("state: modified");
        context.SetState(this);
    }
}
