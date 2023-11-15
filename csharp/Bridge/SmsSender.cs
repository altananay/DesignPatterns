namespace Bridge;

public class SmsSender : MessageSenderBase
{
    public override void Send(MessageBody messageBody)
    {
        Console.WriteLine("{0} was sent via SmsSender", messageBody.Title);
    }
}