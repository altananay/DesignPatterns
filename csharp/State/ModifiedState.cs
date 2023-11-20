namespace State;

public class ModifiedState : IState
{
    public void DoAction(Context context)
    {
        Console.WriteLine("State : modified");
        context.SetState(this);
    }
}