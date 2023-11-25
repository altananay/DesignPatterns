namespace Visitor;

public class Manager : EmployeeBase
{
    public List<EmployeeBase> Subordinates { get; set; }

    public Manager()
    {
        Subordinates = new List<EmployeeBase>();
    }

    public override void Accept(VisitorBase visitor)
    {
        visitor.Visit(this);

        foreach (var employee in Subordinates)
        {
            employee.Accept(visitor);
        }
    }
}
