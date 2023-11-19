package main;

public class Manager extends ExpenseHandlerBase {
  @Override
  public void handleExpense(Expense expense) {
    if (expense.amount <= 100) {
      System.out.println("Manager handled the expense!");
    } else if (successor != null) {
      successor.handleExpense(expense);
    }
  }
}
