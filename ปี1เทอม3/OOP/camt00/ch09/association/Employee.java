package camt.ch09.association;

// employee class
class Employee {
  private String name;

  // employee name
  Employee(String name) {
    this.name = name;
  }

  public String getEmployeeName() {
    return this.name;
  }
}