namespace Bridge;

public class CustomerManager
{
    public MessageSenderBase MessageSenderBase { get; set; }

    public void UpdateCustomer()
    {
        MessageSenderBase.Send(new MessageBody() { Title = "bridge design pattern", Text = "test"});
        Console.WriteLine("Customer updated");
    }
}