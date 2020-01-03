package Inheritance;

public class Game {
	public static void main(String[] args)
	{
		Manager boss= new Manager("Adarsh Singh", 80000, 1987, 12, 15);
		boss.setBonus(500);
		
		EmpSub[] staff= new EmpSub[3];
		staff[0]= boss;		// Manager is a subclass of EmpSub so object of boss can be equated to staff.
		staff[1]= new EmpSub("Amit", 70000, 1989, 04,01);
		staff[2]= new EmpSub("aa", 20000, 1923, 02, 26);
		
		for(EmpSub e: staff)
		{
			System.out.println("name: "+ e.getName()+", Salary: "+ e.getSalary()+ ",Date: "+ e.getHireDay());
		}
			
	}
}
