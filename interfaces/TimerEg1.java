package interfaces;
//Example of interface. Run it individually.
/**
 * Callback -> specify the action when specific action occurs.
 * 
 * javax.swing.JOptionPane
 * 		static void showMessageDialog(Component parent,Object message)
 * 			-> displays a dialog box with a message prompt and an OK button. The dialog is centered
 * 				over the parent component. if parent is null, the dialog is centered on screen.
 * javax.swing.Timer
 * 		Timer(int interval(milliseconds), ActionListener listener)
 * 			->constructs a timer that notifies listener whenever interval milliseconds have elapsed.
 * 		void start()
 * 			->start the timer. calls actionPerformed on its listener
 * 		void stop()
 * 			->stops the timer. 
 * java.awt.Toolkit
 * 		static Toolkit getDefaultToolkit()
 * 			->gets the default toolkit. A toolkit contains info about GUI environment.
 * 		void beep()
 * 			->emits a beep sound.
 * 
 * @author Adarsh
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer; //This is to remove ambiguity with util.Timer.


public class TimerEg1 {
	public static void main(String[] args)
	{
		ActionListener listener= new TimerPrinter();
		//Construct a timer that calls the listener
		//once every 10 second
		Timer t= new Timer(1000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program ?"); 
		System.exit(0);
	}
}

class TimerPrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		System.out.println("At the tone, the time is: "+ new Date());
		Toolkit.getDefaultToolkit().beep();
	}
}
