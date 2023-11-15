namespace Bridge;

public abstract class MessageSenderBase
{
    public void Save()
    {
        Console.WriteLine("Message saved");
    }

    public abstract void Send(MessageBody messageBody);
}