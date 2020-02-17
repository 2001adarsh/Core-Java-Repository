//HashSet does not allow duplicate elements that means
//you can not store duplicate values in HashSet.


/* A well known DataStructure for finding objects quickly is the hash table.
 * A hash table computes an integer, called hash code, for each object. A hash code is
 * somehow derived from the instance fields of an object, preferably in such a way that objects
 * with different data yield different codes.
 */

package collections;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args)
	{
		Set<String> words = new HashSet<>(); //HashSet implements Set
		long totalTime=0;
		int i=1;
		 Scanner in= new Scanner(System.in);
				 while(i<=5)
			 {
				 String word = in.next();
				 long callTime= System.currentTimeMillis();
				 words.add(word);
				 callTime = System.currentTimeMillis()- callTime;
				 totalTime += callTime;
				 i++;
			 }
	
		 
		 Iterator<String> iter= words.iterator();
		 
		 for( i=1; i<=5 && iter.hasNext(); i++)
		 {
			 System.out.println(iter.next());
		 }
		 
		 System.out.println("....");
		 System.out.println(words.size()+" distinct words."+totalTime+ " milliseconds");
		
	}
}
