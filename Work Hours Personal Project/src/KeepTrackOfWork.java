
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
@SuppressWarnings("serial")
public class KeepTrackOfWork extends JFrame{
public KeepTrackOfWork() {
	JFrame frame = new JFrame("Work Tracker");
	JButton Starter = new JButton("Start");
	JButton Stopper = new JButton("Stop");
	final JTextField timeElapsed = new JTextField();
	//WorkTracker keepTrack = new WorkTracker();
	timeElapsed.setBounds(50,50,350,20);
	Starter.setBounds(50,100,95,30);
	Stopper.setBounds(160, 100, 95, 30);
	Starter.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			timeElapsed.setText("Counting!");
			WorkTracker.TimeStart(System.currentTimeMillis());
		}
	});
	Stopper.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
	WorkTracker.TimeStop(System.currentTimeMillis());
	timeElapsed.setText("A total of " + WorkTracker.getTimeElapsed() + " seconds have passed." 
			+ "That is " + WorkTracker.getTimeElapsedInHours() + " hours.");
		}
	});
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame.add(Starter);
	frame.add(Stopper);
	frame.add(timeElapsed);
	frame.setSize(400,400);
	frame.setLayout(null);
	frame.setVisible(true);
	
 }
}