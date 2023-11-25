namespace Visitor;

public class OrganizationalStructure
{
    public EmployeeBase Employee;

    public OrganizationalStructure(EmployeeBase employee)
    {
        Employee = employee;
    }

    public void Accept(VisitorBase visitor)
    {
        Employee.Accept(visitor);
    }
}
