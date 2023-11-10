using Prototype;

Customer customer = new Customer();
customer.FirstName = "altan";
customer.LastName = "anay";
customer.City = "antalya";
customer.Id = 1;
Console.WriteLine(customer.FirstName + "-" + customer.LastName);

Customer customer1 = (Customer)customer.Clone();
customer1.FirstName = "dilek";

Console.WriteLine(customer1.FirstName + "-" + customer1.LastName);