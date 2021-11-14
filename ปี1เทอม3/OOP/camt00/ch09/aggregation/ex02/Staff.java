package camt.ch09.aggregation.ex02;

public class Staff {
  String employeeName;
  // Creating HAS-A relationship with Address class
  Address employeeAddr;

  Staff(String name, Address addr) {
    this.employeeName = name;
    this.employeeAddr = addr;
  }
}