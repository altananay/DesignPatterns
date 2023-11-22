package main;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    Teacher teacher = new Teacher(mediator);

    teacher.Name = "altan";

    Student student = new Student(mediator);
    student.Name = "dilek";

    Student student1 = new Student(mediator);
    student1.Name = "hakan";

    mediator.Students = new ArrayList<>();
    mediator.Students.add(student);
    mediator.Students.add(student1);

    teacher.SendNewImage("test.jpg");

    teacher.RecieveQuestion("test", student);

  }
}
