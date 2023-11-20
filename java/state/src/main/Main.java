package main;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    ModifiedState state = new ModifiedState();
    state.doAction(context);
    DeletedState deletedState = new DeletedState();
    deletedState.doAction(context);

    System.out.println(context.GetState());
  }
}