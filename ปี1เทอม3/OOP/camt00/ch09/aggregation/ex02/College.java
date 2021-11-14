package camt.ch09.aggregation.ex02;

public class College {
  String collegeName;
  // Creating HAS-A relationship with Address class
  Address collegeAddr;

  College(String name, Address addr) {
    this.collegeName = name;
    this.collegeAddr = addr;
  }
}