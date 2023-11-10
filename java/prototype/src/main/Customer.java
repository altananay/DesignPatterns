package main;

public class Customer extends Person {

    public String city;

    public Customer() {}

    public Customer(int id, String firstName, String lastName, String city)
    {
        super(id, firstName, lastName);
        this.city = city;
    }

    @Override
    public Person clone() {
        Customer customerClone = new Customer(this.id, this.firstName, this.lastName, this.city);
        return customerClone;
    }
}
