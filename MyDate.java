import java.util.Date;
import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;  // 0-based, i.e., 0 for January
    private int day;

    // No-arg constructor that creates a MyDate object for the current date
    public MyDate() {
        Date currentDate = new Date();
        long currentTime = currentDate.getTime();
        setDate(currentTime);
    }

    // Constructor that constructs a MyDate object with a specified elapsed time
    // since midnight, January 1, 1970, in milliseconds.
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor that constructs a MyDate object with the specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter method for the year
    public int getYear() {
        return year;
    }

    // Getter method for the month
    public int getMonth() {
        return month;
    }

    // Getter method for the day
    public int getDay() {
        return day;
    }

    // Method to set a new date for the object using elapsed time
    public void setDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH); 
        day = calendar.get(Calendar.DAY_OF_MONTH); 
    } 
}