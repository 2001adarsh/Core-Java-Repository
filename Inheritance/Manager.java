package Inheritance;

public class Manager extends EmpSub {
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
		bonus=0;
	}
	public void setBonus(double b) { bonus=b; }
	
	public double getSalary()
	{
		double base= super.getSalary();
		return base+bonus;
	}
}
