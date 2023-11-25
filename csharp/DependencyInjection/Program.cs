using DependencyInjection;

ProductManager productManager = new ProductManager(new NhProductDal());
productManager.Save();