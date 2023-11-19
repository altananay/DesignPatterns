using Observer;

ProductManager productManager = new ProductManager();
productManager.Attach(new CustomerObserver());
productManager.Attach(new EmployeeObserver());
productManager.UpdatePrice();