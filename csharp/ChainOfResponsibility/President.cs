namespace ChainOfResponsibility;

public class President : ExpenseHandlerBase
{
    public override void HandleExpense(Expense expense)
    {
        if (expense.Amount > 1000)
        {
            Console.WriteLine("President handled the expense!");
        }
    }
}