package main;

public class SmsSender extends MessageSenderBase{
    @Override
    public void send(MessageBody messageBody) {
        System.out.println(messageBody.title + " was sent via SmsSender");
    }
}