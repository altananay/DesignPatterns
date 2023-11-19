package main;

public class President extends ExpenseHandlerBase {
    @Override
    public void handleExpense(Expense expense) {
        if (expense.amount > 1000) {
            System.out.println("President handled the expense!");
        }
    }
}
