package main;

public class DeletedState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("deleted state");
        context.SetState(this);
    }
}
