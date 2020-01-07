package interfaces;
/**
 *copying objects into new object will make changes as the reference
 *	Employee original = new Employee("John Public", 5000);
 *	Employee copy= original;
 *	copy.raiseSalary(20);  // also changes the original
 *	
 *	so, Employee copy= original.clone(); //nice.
 *	
 *	for clonning simple clone (shallow). it works perfectly fine with IMMUTABLE 
 *	but if the subobjects are MUTABLE then deep copy is needed.
 *	Hence for it, we must redefine the clone method to make a deep copy that clones the subobjects
 *	as well.
 * 
 * 	since clone interface is originally protected in library, it couldn't be used for objects 
 * 	of other classes even if it inherits it. Redefine it to public access modifier for increase
 * 	visibility. 
 *	
 * 
 * @author Adarsh
 *
 */
public class ObjectClone_Run {
	public static void main(String[] args) throws Exception
	{
		//try {
			
		CloneEmployee original= new CloneEmployee("John Adarsh", 5000);
		original.setHireDay(2000, 1, 1);
		
		CloneEmployee copy = original.clone();
		copy.raiseSalary(10);
		copy.setHireDay(2002,12,31);
		System.out.println("Original: "+ original);
		System.out.println("Copy: "+ copy);
	
	/*	}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}*/
	}

}
