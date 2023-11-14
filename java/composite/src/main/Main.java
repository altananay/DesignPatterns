package main;

public class Main {
  public static void main(String[] args) {
    Employee altan = new Employee();
    altan.name = "altan";

    Employee dilek = new Employee();
    dilek.name = "dilek";

    altan.addSubordinate(dilek);

    Employee ahmet = new Employee();
    ahmet.name = "ahmet";

    altan.addSubordinate(ahmet);

    Employee ibo = new Employee();
    ibo.name = "ibo";

    dilek.addSubordinate(ibo);

    System.out.println(altan.name);

    for (Person employee : altan.persons)
    {
      System.out.println("    " + employee.name);
      Employee person = (Employee) employee;

      for (Person person1 : person.persons)
      {
        System.out.println("      " + person1.name);
      }
    }
  }
}
