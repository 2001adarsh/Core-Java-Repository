package proxy;

import java.lang.reflect.*;
import java.util.*;
/**
 * Used to create new classes at runtime, that implement a given set of interfaces.
 * the proxy class has following methods->
 * 	- All methods required by the specified interfaces;
 * 	- All methods defined in the object class (toString, equals and so on)
 * 
 * Since we cannot define these on runtime, so we supply an invocation handler (is an object of any class
 * 	that implements the "InvocationHandler" interface). That interface has a single method -
 * 			Object invoke(Object proxy, Method method, Object[] args)
 *  
 *  Properties:
 *  -All proxy class extends the class Proxy
 *  -There is only 1 proxy class for a particular class loader and ordered set of interface. That is, if you call
 *  	the "newProxyInstance" method twice with same class loader and interface array, you get two objects of 
 *  	same class.
 *  -Can get the class with getProxyClass method:
 *  		Class proxyClass = Proxy.getProxyClass(null, interfaces);
 *  - A proxy class is always public and final.
 *  - if want to test if a class is proxy or not-> call isProxyClass method. returns true/false.
 *  
 *  
 * @author Adarsh
 * This program is for tracing method calls.
 */

public class Proxies {
	public static void main(String[] args) {
		Object[] elements= new Object[100];
		for(int i=0; i<elements.length; i++)
		{
			Integer value = i+1;
			InvocationHandler handler = new TraceHandler(value);
			
			//Constructs a new instance of a proxy class that implements the given interfaces.All methods
			//call the invoke method of the given handler object.
			Object proxy = Proxy.newProxyInstance(null, new Class[] { Comparable.class }, handler);
			elements[i] = proxy;
		}
		
		//construct a random Integer
		Integer key = new Random().nextInt(elements.length) +1;
		
		//search for the key
		int result = Arrays.binarySearch(elements, key);
		if(result >= 0) System.out.println(elements[result]);
		
	}
}
class TraceHandler implements InvocationHandler
{
	private Object target;
	public TraceHandler(Object t)
	{
		target = t;
	}
	//action to be carried out, when method was invoked on the proxy object.
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable
	{
		//Prints implicit argument
		System.out.print(target);
		
		//prints method name
		System.out.print("."+ m.getName()+ " (");
		
		//print explicit arguments
		if(args != null)
		{
			for(int i=0; i<args.length; i++)
			{
				System.out.print(args[i]);
				if( i<args.length-1 ) System.out.print(",");
			}
		}
		System.out.println(")");
		
		//Invoke actual method
		return m.invoke(target, args);
	}
}


/**
* When you want to construct an object of a class that implements one or more interfaces whose exact nature
* you may not know at the compile-time. For this, you can create a class using "newInstance" method or use
* reflection to find a constructor.
* 
* But for construction an object for interface you need to implement a class using proxies.
* Applications:
* 	-> Routing method calls to remote servers.
* 	-> Associating user interface events with actions in a running program.
* 	-> Tracing method calls for debugging purposes.
* 
*
*/