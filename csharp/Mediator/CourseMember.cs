
namespace Mediator;

public abstract class CourseMember
{
    protected Mediator Mediator;

    protected CourseMember(Mediator mediator)
    {
        Mediator = mediator;
    }
}