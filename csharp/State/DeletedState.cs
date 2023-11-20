namespace State;

public class DeletedState : IState
{
    public void DoAction(Context context)
    {
        Console.WriteLine("State : deleted");
        context.SetState(this);
    }
}
