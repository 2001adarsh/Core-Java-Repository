package innerclass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * advantages:
 * -can access the data from the scope in which they are defined, including private data's without need of methods.
 * -hidden from other classes even in the same package.
 * -Anonymous innerclass handy when defining for callbacks.
 * 
 * 	More on Syntax:
 * 	1. can call innerclass from main by:
 * 			outerObject.new InnerClass(construction parameters)
 * 		ie,
 * 			TalkingClock j = new TalkingClock(1000,true);
 * 			TalkingClock.TimePrinter listener = j.new TimePrinter();
 * 
 *  2. can avoid any kind of ambiguity using
 *  	OuterClass.this  
 *  		ie, if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
 *  
 *  3. When outside the scope of outer class, we can refer innerclass as
 *  		OuterClass.InnerClass 
 *  
 *  Important points:
 *  	1. Any static fields in inner class must also be final. And inner class cannot have static methods.
 *  
 *   
 * @author Adarsh
 *
 */
public class InnerClassTest {
	public static void main(String[] args)
	{
		TalkingClock clock = new TalkingClock(1000,true);
		clock.start();
		
		JOptionPane.showMessageDialog(null,"Quit program?");
		System.exit(0);
	
	}
}

/**
 * A clock that prints the time in regular interval.
 */
class TalkingClock{
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval , boolean beep)
	{
		this.interval=interval;
		this.beep=beep;
	}
	public void start()
	{							
		ActionListener listener=new TimePrinter(); //calling the inner class.
		Timer t= new Timer(interval, listener);
		t.restart();
	}
	//The InnerClass.
	public class TimePrinter implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("At the tone, the time is "+ new Date());
			if(beep) Toolkit.getDefaultToolkit().beep();   //beep in if condition, was called from outer class.
		}
	}
}
