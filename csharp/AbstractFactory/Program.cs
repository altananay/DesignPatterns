using AbstractFactory;

ProductManager productManager = new ProductManager(new AlternativeFactory());
productManager.GetAll();
Console.ReadLine();