import java.text.DecimalFormat;

public class WorkTracker {

public static long startTime = 0;
public static long stopTime = 0;

public static DecimalFormat decFormat = new DecimalFormat();
static {
decFormat.setMaximumIntegerDigits(10);
decFormat.setMaximumFractionDigits(3);
decFormat.setMinimumFractionDigits(3);
}

public static void TimeStart(long pushTime) {
	startTime = pushTime/1000;

}
public static void TimeStop(long stoppedTime) {
	stopTime = stoppedTime/1000;
	
}
public static String getTimeElapsed() {
	return decFormat.format(stopTime - startTime);
}

public static String getTimeElapsedInHours() {
	return decFormat.format((stopTime - startTime)/24);
}
}
