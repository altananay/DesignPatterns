package main;

public class Worker extends EmployeeBase{
    @Override
    public void Accept(VisitorBase visitor) {
        visitor.Visit(this);
    }
}