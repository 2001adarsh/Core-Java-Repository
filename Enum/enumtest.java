package Enum;

import java.util.Scanner;

/**
 * Variadic functions or Varags(variable arguments):
 * 	written with ellipses ie, ...(three dots after one fixed arguments).
 * 	Eg. printf(), cout
 * Implementation of print statements:
 * 	public class printstream
 * 		{
 * 			public printstream printf(String fmt, ... args) { return format(fmt,args); }
 * 		}
 * 
 * Enumeration:
 * java.lang.Enum<E> 
 * 
 * 	static Enum valueof(Class enumClass, String name) - returns enum constant of given class with given name.
 * 	String toString() - return the name of this enum constant
 * 	int ordinal() - returns the zero-based position of this enumerated const. in the enum decl.
 * 	int compareTo(E other) - returns a negative integer if this enum constant comes before other,
 * 	zero if this==other, and positive  int otherwise.
 *  
 * @author Adarsh
 *
 */
enum Size
{
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	
	private Size(String abbreviation) { this.abbreviation= abbreviation;}
	public String getAbbreviation() { return abbreviation;}
	private String abbreviation;
}

public class enumtest {
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE) ");
		String input= in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size="+ size);
		System.out.println("abbreviation= "+ size.getAbbreviation());
		if(size== Size.EXTRA_LARGE)
			System.out.println("Correct.");
		
	}
		
}
