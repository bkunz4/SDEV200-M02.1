import java.util.GregorianCalendar;
import java.util.Date;
//import java.util.Calendar;

// A class named MyDate that represents a date
public class MyDate {
  // The data fields year, month, and day
  private int year, month, day;

  // A no-arg constructor that creates a MyDate object for the current date
  MyDate() {
    // Use the java.util.GregorianCalendar class to get the current date
    GregorianCalendar calendar = new GregorianCalendar();
    this.year = calendar.get(GregorianCalendar.YEAR);
    this.month = calendar.get(GregorianCalendar.MONTH);
    this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
  }

  // A constructor that constructs a MyDate object with a specified elapsed time
  public MyDate(long elapsedTime) {
    // Use the java.util.Date class to create a date object from the elapsed time
    Date date = new Date(elapsedTime);
    // Use the java.util.Calendar class to set the year, month, and day fields
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTime(date);
    this.year = calendar.get(GregorianCalendar.YEAR);
    this.month = calendar.get(GregorianCalendar.MONTH);
    this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
  }

  // A constructor that constructs a MyDate object with the specified year, month, and day
  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  // Three getter methods for the data fields year, month, and day
  public int getYear() {
    return this.year;
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  // A method named setDate that sets a new date for the object using the elapsed time
  public void setDate(long elapsedTime) {
    // Use the same logic as the constructor with the elapsed time parameter
    Date date = new Date(elapsedTime);
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTime(date);
    this.year = calendar.get(GregorianCalendar.YEAR);
    this.month = calendar.get(GregorianCalendar.MONTH);
    this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
  }
}