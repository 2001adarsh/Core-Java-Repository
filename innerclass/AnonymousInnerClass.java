package innerclass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * local inner class can be more handy, when need only a single object of this inner class. You don't have
 * to even given inner class a name.
 * 
 * Syntax:
 * 		new SuperType(construction parameters)
 * 		{
 * 			inner class methods and data
 * 		}
 * 	SuperType can be a interface, eg. ActionListener, then inner class will implement it.
 * 				also be class, then inner class will extend it.
 * 
 * -> Anonymous InnerClasses do not have any construction parameters, hence construction parameters are given to
 * 		superclass constructor. You must supply a set of parantheses as in
 * 		new InterfaceType()
 * 			{
 * 				methods and data;
 * 			}
 * ->look carefully to see
 * 		Person queen= new Person("Marry"); // construction of a new object of a class.
 * 	while
 * 		Person count= new Person("Dracula") {....}; // construction of an object of an anonymous inner class.
 * 
 * 
 * ==> TRICK:
 * 	instead of 											could have used anonymous inner class as,
 * 	ArrayList<String> friends = new ArrayList<>();   	invite( new ArrayList<String>() { 
 * 	friends.add("Harry");									{ add("Harry"); add("Tony");}
 * 	friends.add("Tony");								}
 * 	invite(friends);									// outer braces to make anonymous subclass of ArrayList.	
 * 														//inner braces to object construction block.
 * 
 * 
 * @author Adarsh										
 */
public class AnonymousInnerClass {
	public static void main(String[] args)
	{
		TalkingClock2 clock= new TalkingClock2();
		clock.start(1000,true);
		
		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);
	}
}

class TalkingClock2  //changed the class name, as TalkingClock is already in this package.
{	
	public void start(int interval, boolean beep)
	{ 
		ActionListener listener= new ActionListener()   //Anonymous Inner class being called. 
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("At the tone, the time is: "+new Date());
				if(beep) Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t= new Timer(interval, listener);
		t.start();
	}
}
