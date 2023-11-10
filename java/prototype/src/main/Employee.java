package main;

public class Employee extends Person{

    public double salary;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, double salary)
    {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public Person clone() {
        Employee employeeClone = new Employee(this.id, this.firstName, this.lastName, this.salary);
        return employeeClone;
    }
}
