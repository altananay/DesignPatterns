package main;

public class Student extends CourseMember{

    public String Name;

    public Student(Mediator mediator)
    {
        super(mediator);
    }

    public void RecieveImage(String url)
    {
        System.out.println("Student " +  this.Name + " received image: " + url);
    }

    public void ReceiveAnswer(String answer)
    {
        System.out.println("student " + this.Name + " received answer " + answer);
    }

}
