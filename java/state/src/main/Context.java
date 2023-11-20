package main;

public class Context {
    private State _state;

    public void SetState(State state)
    {
        _state = state;
    }

    public State GetState()
    {
        return _state;
    }
}
