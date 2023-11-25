package main;

public class Payrise extends VisitorBase{
    @Override
    public void Visit(Worker worker) {
        System.out.println(worker.Name + " salary increased to " + worker.Salary*1.1);
    }

    @Override
    public void Visit(Manager manager) {
        System.out.println(manager.Name + " salary increased to " + manager.Salary*1.2);
    }
}
