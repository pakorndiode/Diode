package camt.ch04.access_modifiers.example;

public class Clock {
  private long time = 0;

  protected Clock() {
    this.time = 0;
  }

  protected Clock(long time) {
    this.time = time;
  }

  public Clock(long time, long timeOffset) {
    this(time);
    this.time += timeOffset;
  }

  public static Clock newClock() {
    return new Clock(System.currentTimeMillis());
  }

  public long getTime() {
    return this.time;
  }

  public void setTime(long theTime) {
    this.time = theTime;
  }
}