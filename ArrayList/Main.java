package ArrayList;

import java.util.ArrayList;

import Inheritance.EmpSub;

/**
 * ArrayList<Type> obj= new ArrayList<Type>();
 * or you can omit Type on right side, ie,
 * ArrayList<Type> obj= new ArrayList<>();  <> is called Diamond Syntax.
 * 
 * C++ note : 
 * 		-Vectors in c++ are similar to ArrayList in Java, moreover C++ vector template overloads [] so it must
 * 		use explicit call while java doesn't overload [].
 * 		-Vectors are call by value, i.e., a=b means a new vector is created of same length and element value while
 * 		in java they are referenced to one another, so any changes in one reflects in another.
 * 
 * ArrayList<int> obj= new ArrayList<>(100) - initial size
 * obj.add(100); adding
 * obj.size(); return size
 * obj.ensureCapacity(int capacity); fixed size given
 * obj.trimToSize() -> storage capacity to current size of array
 * 						rarely used and shouldn't be used, use only when sure about it.
 * 
 * 
 * obj.set(i, 10); sets ith value with 10. But to use this there has to be a value before. So add() before set()
 * obj.add(i,e); sometimes adding element in middle of the array.
 * obj.get(i); returns value at i
 * obj.remove(i); removes value at i and left shifts remaining element.
 * 
 * Trick for flexible growth and convenient element access->
 * 	
 * ArrayList<X> list = new ArrayList<>();  //First make a Flexible list
 * 	while(...)
 * { x=...
 * 	list.add(x);
 * }
 * 
 * X[] a= new X[list.size()];  //Then convert it into an array for easy element access.
 * list.toArray(a);
 *
 *
 * 
 * 
 * @author Adarsh
 *
 */
public class Main {
	public static void main()
	{
		ArrayList<EmpSub> staff= new ArrayList<>();
		
		staff.add( new EmpSub("Carl Cracker",75000,1987,12,15) );
		staff.add( new EmpSub("Harry Hacker", 50000, 1989,10,1) );
		staff.add( new EmpSub("Tony Tester", 40000,1990,3,15) );
		
		for(EmpSub e: staff)
		{
			e.raiseSalary(5);
		}
		
		for(EmpSub e: staff)
		{
			System.out.println("name: "+ e.getName()+ ",salary: "+ e.getSalary()+",hireDay: "+ e.getHireDay());
		}
	}
}
