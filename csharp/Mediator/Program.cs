using Mediator;

Mediator.Mediator mediator = new();
Teacher teacher = new Teacher(mediator);
teacher.Name = "altan";

mediator.Teacher = teacher;

Student student = new Student(mediator);
student.Name = "dilek";

Student student2 = new Student(mediator);
student2.Name = "hakan";

mediator.Students = new List<Student> { student, student2 };

teacher.SendNewImage("test.jpg");

teacher.RecieveQuestion("test", student);