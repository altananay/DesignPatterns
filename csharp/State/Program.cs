using State;

Context context = new Context();
ModifiedState state = new ModifiedState();
state.DoAction(context);
DeletedState deletedState = new DeletedState();
deletedState.DoAction(context);

Console.WriteLine(context.GetState());