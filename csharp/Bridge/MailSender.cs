namespace Bridge;

public class MailSender : MessageSenderBase
{
    public override void Send(MessageBody messageBody)
    {
        Console.WriteLine("{0} was sent via MailSender", messageBody.Title);
    }
}