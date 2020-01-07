package LambdaExp;

import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.*;

/**
 * Lambda Expressions:
 * is a block of code that you can pass around so it can be executed later, once or multiple times.
 * 	parameters, ->(arrow), ( expression enclosed in {} ).
 * 	
 * 	Eg. Comparator<String> comp = (first, second)  //Same as (String first, String second)
 * 									-> { first.length() - second.length() };
 * 		if there are no parameters then simply,
 * 		() -> { for(int i=100; i>=0; i--) System.out.println(i); }
 * 
 * -> You can use lambda expressions whenever an object of an interface with a single abstract method
 * 		is expected. It is called FUNCTIONAL INTERFACE.
 * -> 
 * 
 * @author Adarsh
 *
 */
//Before this program do check programs in interfaces.
public class Run {
	public static void main(String[] args)
	{
		String[] planets= new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		System.out.println(Arrays.deepToString(planets));
		System.out.println("Sorted in dictionary order");
		Arrays.sort(planets);
		System.out.println(Arrays.deepToString(planets));
		System.out.println("Sorted by length: ");
		
		Arrays.sort(planets, (first,second)-> first.length()-second.length()); //Lambda Expression;
		
		System.out.println(Arrays.toString(planets));
		//Lambda Expression
		Timer t= new Timer(1000, event -> { System.out.println("The time is: "+ new Date() ); 
		Toolkit.getDefaultToolkit().beep();
		});
		
		t.start();
		
		//Keep running until user select "ok"
		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);
	}
}

/* EXPLANATIONS:
 * 
 * Arrays.sort(words, (first, second) -> first.length() - second.length() );
 * 
 * Behind the scene, the Arrays.sort method receives an object of some class that implements "Comparator<String>".
 * Invoking the "compare" method on that object executes the body of lambda expression. The management of these
 * objects and classes is completely implementation dependent, and it can be much more efficient than using traditional inner
 * classes. It is best to think lambda expression as a function,not an object, and to accept that it can be passed to
 * a functional interface.
 * 
 */

/* BiFunction:
 * in java.util.function package, one of the interfaces BiFunction<T,U,R> describes function with parameter
 * types T,U and return type R. 
 * 	so it can be helpful if needed.
 * 	BiFunction<String, String, Integer> comp
 * 	= (first, second) ->first.length() - second.length(); but it cant be used for sorting since it does not implement BiFunction.
 *
 *	 Arrays have removeIf interface:
 *	list.removeIf(e -> e==null);
 */
