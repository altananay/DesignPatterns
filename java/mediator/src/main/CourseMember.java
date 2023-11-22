package main;

public abstract class CourseMember {
    protected Mediator Mediator;

    protected CourseMember(Mediator mediator)
    {
        Mediator = mediator;
    }
}
