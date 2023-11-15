using Bridge;

CustomerManager customerManager = new CustomerManager();
customerManager.MessageSenderBase = new SmsSender();
customerManager.UpdateCustomer();