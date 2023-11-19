package main;

public abstract class ExpenseHandlerBase {
    protected ExpenseHandlerBase successor;
    public abstract void handleExpense(Expense expense);
    public void setSuccessor(ExpenseHandlerBase successor)
    {
        this.successor = successor;
    }
}