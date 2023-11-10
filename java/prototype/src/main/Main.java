package main;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.firstName = "altan";
    customer.lastName = "anay";
    customer.id = 1;
    customer.city = "antalya";
    System.out.println(customer.firstName + " - " + customer.lastName);

    Customer customer1 = (Customer) customer.clone();
    customer1.firstName = "dilek";

    System.out.println(customer1.firstName + " - " + customer1.lastName);

    Employee employee = new Employee();
    employee.id = 2;
    employee.firstName = "mehmet";
    employee.lastName = "can";
    employee.salary = 15000;

    System.out.println(employee.firstName + " - " + employee.lastName);

    Employee employee1 = (Employee) employee.clone();
    employee1.firstName = "şuayipp";

    System.out.println(employee1.firstName + " - " + employee.lastName);
  }
}