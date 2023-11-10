package main;

public abstract class Person {
    public int id;
    public String firstName;
    public String lastName;

    public Person() {}

    public Person(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract Person clone();
}