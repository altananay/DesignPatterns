using Proxy;

CalculatorBase creditManager = new CreditManagerProxy();
Console.WriteLine(creditManager.Calculate());
Console.WriteLine(creditManager.Calculate());