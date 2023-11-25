package main;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    manager.Name = "altan";
    manager.Salary = 50000;

    Worker worker = new Worker();
    worker.Name = "dilek";
    worker.Salary = 30000;

    manager.Subordinates.add(worker);

    OrganizationalStructure organizationalStructure = new OrganizationalStructure(manager);

    PayrollVisitor payrollVisitor = new PayrollVisitor();
    Payrise payrise = new Payrise();

    organizationalStructure.Accept(payrollVisitor);
    organizationalStructure.Accept(payrise);
  }
}
