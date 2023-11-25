package main;

import java.util.ArrayList;
import java.util.List;

public class Manager extends EmployeeBase {

  public List<EmployeeBase> Subordinates;

  public Manager() {
    Subordinates = new ArrayList<>();
  }

  @Override
  public void Accept(VisitorBase visitor) {
    visitor.Visit(this);

    for (EmployeeBase employee : Subordinates) {
      employee.Accept(visitor);
    }
  }
}
