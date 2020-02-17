package collections;

//HashMap does not allow duplicate keys however it allows to have duplicate values.
//HashSet permits to have a single null value. HashMap permits single null key and any number of null values.
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Adarsh
 *
 *	Functions of HashMap:
 *	put(key,value) - to insert values in HashMap
 *	get(key) - to access the value of the key given. returns value.  eg. get(1);
 *  remove(key) - to remove the key in the HashMap.
 *  clear() - to clear all the elements from HashMap
 *  size() - returns size of HashMap
 *  
 *  for traversing through hashMap:
 *  	Use the keySet() method if you only want the keys, 
 *  		and use the values() method if you only want the values:
 *	Example:
 *	// Print keys
 *	for (String i : capitalCities.keySet()) {
 * 	System.out.println(i);
 *	}
 * 
 * Example: Print values
 * for (String i : capitalCities.values()) {
 * System.out.println(i);
 *	}
 * 
 */

public class HashMapDemo {
	public static void main(String[] args)
	{
		HashMap<Integer,String> hmap = new HashMap<Integer, String> ();
		Scanner sc= new Scanner(System.in);
		String s; 
		int key;
		
		int n;
		n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			key= sc.nextInt(); 
			s=sc.next();
			hmap.put(key, s);
		}
		
	System.out.println("HashMap contains: "+hmap);
	
	System.out.println("The value of 1 is: "+hmap.get(1));
	}

}

/**
 * input:
 * 5
 * 1 aa
 * 2 bb
 * 3 cc
 * 4 dd
 * 5 ee
 * 
 */
