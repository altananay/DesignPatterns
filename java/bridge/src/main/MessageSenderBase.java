package main;

public abstract class MessageSenderBase {

    public void save()
    {
        System.out.println("Message saved");
    }

    public abstract void send(MessageBody messageBody);
}
