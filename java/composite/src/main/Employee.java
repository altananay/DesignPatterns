package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Employee extends Person{
  List<Person> persons = new ArrayList<>();

  public void addSubordinate(Person person)
  {
      persons.add(person);
  }

  public void removeSubordinate(Person person)
  {
      persons.remove(person);
  }

  public List<Person> getPersons()
  {
      return persons;
  }
}