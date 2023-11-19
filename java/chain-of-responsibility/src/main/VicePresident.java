package main;

public class VicePresident extends ExpenseHandlerBase {
  @Override
  public void handleExpense(Expense expense) {
    if (expense.amount > 100 && expense.amount <= 1000) {
      System.out.println("Vice president handled the expense!");
    } else if (successor != null) {
      successor.handleExpense(expense);
    }
  }
}
