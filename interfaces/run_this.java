package interfaces;

import java.util.Arrays;

/**
 * Interfaces don't contain instance fields(variable) or static methods, 
 * contain only functions(methods).
 * can supply constants in them
 * 	
 * 	
 * class to interface -> implements
 * interface to interface -> extends
 * class to class -> extends
 * 
 * Double.compare(a,b); -> returns 0 if equal, -ve if less, +ve if more than b 
 * 
 *	Eg. a class must have compareTo() method for it to have use sort() functions.
 *
 *	instanceof=>
 *		is used to check if object is of a specific class;
 *	eg, if( anobject instanceof Comparable) { ...}
 *
 * 
 * @author Adarsh
 *	
 *	points to remember:
 *	-> is used to implement polymorphism.
 *	->interfaces are not class, so cannot instantiate ie, x= new Comparable(...); //ERROR
 *	->however can create objects as, Comparable x; this object must refer to an object of class
 *		that implements the interface, x= new Employee(...); //OK.
 *	-> methods are automatically public, likewise fields are always public static final.
 *	-> classes can implement multiple inheritance, while cannot extends multiple inheritance.
 *	->interfaces can implement multiple inheritance.
 *	-> class Employee extends Person implements Comparable, LoveMe //OK
 *
 *Default methods in interfaces are non-abstract methods. in which nothing has to be provided.
 *	Eg.
 *		public interface MouseListener
 *		{
 *			default void mouseClicked(MouseEvent event) {}
 *			default void mousePressed(MouseEvent event) {}
 *			and so on...
 *		}
 */

public class run_this {
	public static void main(String[] args)
	{
		Employee[] staff= new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1]= new Employee("Carl Cracker", 75000);
		staff[2]= new Employee("Tony Testor", 38000);
		
		Arrays.sort(staff);
		
		for(Employee e: staff)
			System.out.println("name= "+e.getName()+ " ,salary= "+ e.getSalary());
		
	}
}
	/**
	*  Resolving Default Method Conflict:
	*  	if default method in one interface matches with one interface or superclass then,
	*  1. if superclass, SuperClass wins.
	*  2. if interface, programmer has to resolve it by,
	*  	eg.
	*  	class Student implements Person, Named
	*  {
	*  	public String getName() //assuming this method to be in both Person and Named.
	*  	{ return Person.super.getName();// calls specific method. 
	*  		}
	*  }
	*  
	*/