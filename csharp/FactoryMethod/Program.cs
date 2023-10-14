using FactoryMethod;

CustomerManager customerManager = new CustomerManager(new LoggerFactory2());
customerManager.Save();

Console.ReadLine();