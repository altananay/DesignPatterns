package main;

public abstract class VisitorBase
{
    public abstract void Visit(Worker worker);
    public abstract void Visit(Manager manager);
}