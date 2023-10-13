using Singleton;

var customerManager = CustomerManager.CreateAsSingleton();
customerManager.Save();
Console.WriteLine(customerManager.GetHashCode());
var customerManager2 = CustomerManager.CreateAsSingleton();
Console.WriteLine(customerManager2.GetHashCode());