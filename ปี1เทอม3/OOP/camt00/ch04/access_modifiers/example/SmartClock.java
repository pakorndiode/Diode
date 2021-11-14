package camt.ch04.access_modifiers.example;

public class SmartClock extends Clock {

//  public long getTimeInSeconds() {
//    return this.time / 1000;
//  }

  public long getTimeInSeconds() {
    return this.getTime() / 1000;
  }
  
}