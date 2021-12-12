import java.text.DecimalFormat;

public class User {
public String name;
private double timePassed = 0;
private boolean clockedIn = false;
public static long startTime = 0;
public static long stopTime = 0;

public User(String name) {
	this.name = name;
}

//TODO: add password functionality 
public void addTime(double timeAdded) {
	timePassed += timeAdded;

}
public void clockIn() {
	clockedIn = true;
}
public void clockOut() {
	clockedIn = false;
}
public boolean getClockInStatus() {
	return clockedIn;
}
public int getTimePassedInt() {
	//convert double to int
	int timePassedInt = (int)timePassed;
	return timePassedInt;
}
public void TimeStart(long pushTime) {
	startTime = pushTime/1000;

}
public void TimeStop(long stoppedTime) {
	stopTime = stoppedTime/1000;
	
}
public long getTimeElapsedLong() {
	return stopTime - startTime;
}


public String timePassedHours() {
	DecimalFormat decFormat = new DecimalFormat();
	decFormat.setMaximumIntegerDigits(10);
	decFormat.setMaximumFractionDigits(3);
	decFormat.setMinimumFractionDigits(3);
	return decFormat.format(timePassed/3600);
}
public String timePassedTotal(int totalSeconds) {
	// https://www.inchcalculator.com/convert/second-to-hour/ to convert seconds to hours, mins, and secs
		int totalHours = totalSeconds/3600;
		int minutesLeft =  (totalSeconds - (totalHours * 3600))/60 ;
		int secondsLeft = totalSeconds - (minutesLeft * 60);
		return totalHours + " hours, " + minutesLeft + " minutes, " + "and " + secondsLeft + " seconds";
}

}
