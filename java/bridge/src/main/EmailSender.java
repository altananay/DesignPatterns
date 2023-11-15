package main;

public class EmailSender extends MessageSenderBase{
    @Override
    public void send(MessageBody messageBody) {
        System.out.println(messageBody.title + " was sent via EmailSender");
    }
}
