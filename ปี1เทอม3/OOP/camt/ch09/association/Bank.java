package camt.ch09.association;

public class Bank {
  private String name;

  // bank name
  Bank(String name) {
    this.name = name;
  }

  public String getBankName() {
    return this.name;
  }
}