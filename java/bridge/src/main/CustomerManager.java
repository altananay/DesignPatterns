package main;

public class CustomerManager {

  public MessageSenderBase messageSenderBase;

  public void UpdateCustomer() {
    messageSenderBase.send(new MessageBody("bridge design pattern", "test"));
  }
}
