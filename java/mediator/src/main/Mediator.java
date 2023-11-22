package main;

import java.util.List;

public class Mediator {
    public Teacher Teacher;
    public List<Student> Students;

    public void UpdateImage(String url)
    {
        for (var student : Students)
        {
            student.RecieveImage(url);
        }
    }

    public void SendQuestion(String question, Student student)
    {
        Teacher.RecieveQuestion(question, student);
    }

    public void SendAnswer(String answer, Student student)
    {
        student.ReceiveAnswer(answer);
    }
}
