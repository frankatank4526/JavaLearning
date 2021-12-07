
public class User {
public String name;
private double timePassed = 0;
private boolean clockedIn = false;


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
public double getTimePassedInt() {
	//convert double to int
	int timePassedInt = (int)timePassed;
	return timePassedInt;
}


}
