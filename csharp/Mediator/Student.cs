
namespace Mediator;

public class Student(Mediator mediator) : CourseMember(mediator)
{
    public string Name { get; set; }

    public void RecieveImage(string url)
    {
        Console.WriteLine("Student " +  this.Name + " received image: " + url);
    }

    public void ReceiveAnswer(string answer)
    {
        Console.WriteLine("student " + this.Name + " received answer " + answer);
    }
}
