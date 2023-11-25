package main;

public abstract class EmployeeBase
{
    public String Name;
    public double Salary;

    public abstract void Accept(VisitorBase visitor);
}
