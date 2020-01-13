package equaltoStringHashCode;
/**
 * getName() -> returns the name of this class.
 * getSuperClass() ->returns superclass of this class.
 * 
 * Equals() check if the content are  same or not.
 * == checks if they reference to the same variable or not.
 * 
 * Alice1 and Alice3 should have same hashCode() since they are equals().
 * 
 * int[] luckyNumbers= {2,3,4,5,6};
 * String s= Arrays.toString(luckyNumber);
 * yeilds a string "[2,3,4,5,6]".
 * 
 * 
 * 
 * @author Adarsh
 *
 */
public class main {
	public static void main(String[] args)
	{
		Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice Adams", 75000,1987,12,15);
		Employee bob= new Employee("Bob Brandson", 50000,1989,10,1);
		
		System.out.println("alice1==alice2: " + (alice1==alice2));
		
		System.out.println("alice1== alice3: " + (alice1==alice3));
		
		System.out.println("alice1.equals(bob): "+ alice1.equals(bob));
		System.out.println("alice1.equals(alice3): "+ alice1.equals(alice3));
		System.out.println("bob.toString(): "+ bob);
		
		Manager carl = new Manager("Carl Cracker",80000,1987,12,15);
		Manager boss= new Manager("Carl Cracker", 80000 ,1987,12,15);
		boss.setBonus(5000);
		//toString:
		System.out.println("boss.toString(): "+ boss);
		
		//equals: checks if refenced to same
		System.out.println("carl.equals(boss): "+ carl.equals(boss));  //false cause, bonus not in carl.
		
		//hashCode: returns int (also in neg.) for any object;
		System.out.println("alice1.hashCode(): "+ alice1.hashCode());
		System.out.println("alice3.hashCode(): "+ alice3.hashCode());
		System.out.println("bob.hashCode(): "+ bob.hashCode() );
		System.out.println("carl.hashCode(): "+ carl.hashCode());
		System.out.println("boss.hashCode(): "+ boss.hashCode());
		
	}
}
