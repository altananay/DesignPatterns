package main;

import java.io.Console;

public class Teacher extends CourseMember{

    public String Name;

    public Teacher(Mediator mediator)
    {
        super(mediator);
    }

    public void RecieveQuestion(String question, Student student)
    {
        System.out.println("teacher received a question from " + student.Name + " question: " + question);
    }

    public void SendNewImage(String url)
    {
        System.out.println("Teacher changed slide: " + url);
        Mediator.UpdateImage(url);
    }

    public void AnswerQuestion(String answer, Student student)
    {
        System.out.println("Teacher answered question " + student.Name + " " + answer);
    }

}
