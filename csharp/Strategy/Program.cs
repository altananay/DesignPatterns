using Strategy;

CustomerManager customerManager = new CustomerManager();
customerManager.CreditCalculatorBase = new AfterCreditCalculator();
customerManager.SaveCredit();