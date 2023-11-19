using ChainOfResponsibility;

Manager manager = new Manager();
VicePresident vicePresident = new VicePresident();
President president = new President();

manager.SetSuccessor(vicePresident);
vicePresident.SetSuccessor(president);

Expense expense = new Expense();
expense.Detail = "Test";
expense.Amount = 1011;
manager.HandleExpense(expense);