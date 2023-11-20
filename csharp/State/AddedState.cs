namespace State;

public class AddedState : IState
{
    public void DoAction(Context context)
    {
        Console.WriteLine("State : added");
        context.SetState(this);
    }
}