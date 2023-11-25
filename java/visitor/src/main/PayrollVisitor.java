package main;

public class PayrollVisitor extends VisitorBase {
    @Override
    public void Visit(Worker worker) {
        System.out.println(worker.Name + " paid " + worker.Salary);
    }

    @Override
    public void Visit(Manager manager) {
        System.out.println(manager.Name + " paid " + manager.Salary);
    }
}
