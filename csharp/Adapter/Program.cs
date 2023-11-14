using Adapter;

ProductManager productManager = new ProductManager(new Log4NetAdapter());
productManager.Save();
