
namespace Mediator;

public class Teacher : CourseMember
{

    public string Name { get; set; }

    public Teacher(Mediator mediator) : base(mediator)
    {
    }

    public void RecieveQuestion(string question, Student student)
    {
        Console.WriteLine("teacher received a question from " + student.Name + " question: " + question);
    }

    public void SendNewImage(string url)
    {
        Console.WriteLine("Teacher changed slide: " + url);
        Mediator.UpdateImage(url);
    }

    public void AnswerQuestion(string answer, Student student)
    {
        Console.WriteLine("Teacher answered question " + student.Name, answer);
    }
}
