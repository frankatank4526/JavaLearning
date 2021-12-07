
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
@SuppressWarnings("serial")
public class KeepTrackOfWork extends JFrame{
public KeepTrackOfWork() {
	//initializes all panel objects 
	JFrame frame = new JFrame("Work Tracker");
	JButton Starter = new JButton("Start");
	JButton Stopper = new JButton("Stop");
	JTextField timeElapsed = new JTextField();
	JTextField userInfo = new JTextField();
	JLabel userNameHere = new JLabel("Type your name here and press enter");
	//WorkTracker keepTrack = new WorkTracker();
	User newUser = new User("");
	timeElapsed.setBounds(15,50,300,20);
	Starter.setBounds(50,100,95,30);
	Stopper.setBounds(160, 100, 95, 30);
	userInfo.setBounds(100, 200, 200, 20);
	userNameHere.setBounds(80, 230 ,300,50);
	
	userInfo.addActionListener(new ActionListener() {
		// userInfo Text field action listener, gets input for userName
		//TODO: password functionality, add textField and JButton; Upon clicking JButton, read & check
		// username & password matches.
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			newUser.name = userInfo.getText();
			userNameHere.setText(newUser.name + " has Logged in!");
			
		}
		
	});
	
	// Start Button actionListener, starts time count
	Starter.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			timeElapsed.setText("Counting!");
			WorkTracker.TimeStart(System.currentTimeMillis());
		}
	});
	
	// Stop Button actionListener, stops time count
	Stopper.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	// TODO: Add functionality to add worked hours to timePassed in userInfo & store that data somewhere ****	
			
	
	WorkTracker.TimeStop(System.currentTimeMillis());
	newUser.addTime(WorkTracker.getTimeElapsedLong());
	
	timeElapsed.setText(newUser.name + " has worked for " + "a total of " + newUser.getTimePassedInt() + 
			"seconds." + "That is " + newUser.timePassedHours() + " hours." );
		}
	});
	
	// configures frame 
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame.add(Starter);
	frame.add(Stopper);
	frame.add(timeElapsed);
	frame.add(userInfo);
	frame.add(userNameHere);
	frame.setSize(400,400);
	frame.setLayout(null);
	frame.setVisible(true);
	
 }
}