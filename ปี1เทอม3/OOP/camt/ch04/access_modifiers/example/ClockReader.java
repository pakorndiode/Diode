package camt.ch04.access_modifiers.example;

public class ClockReader {
  Clock clock = new Clock(0);

//  public long readClock() {
//    return clock.time;
//  }

  public long readClock() {
    return clock.getTime();
  }
}