package interfaces;

public class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.name= name;
		this.salary= salary;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary(double byPercent)
	{
		double raise= salary* byPercent /100;
		salary+= raise;
	}
	
	/**
	 * @param other another Employee object.
	 * compares employees by salary.
	 * 
	 * for descending order just flip the @param.
	 * 
	 */
	public int compareTo(Employee other)
	{
		return Double.compare(salary, other.salary);
	}
}
