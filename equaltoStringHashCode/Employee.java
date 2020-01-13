package equaltoStringHashCode;
import java.time.*;
import java.util.Objects;  //Objects is a SuperClass which is SuperCLass of all classes.

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name= name;
		this.salary= salary;
		hireDay= LocalDate.of(year, month, day);
	}
	
	public String getName()	{ return name; }
	public double getSalary() { return salary; }
	public LocalDate getHireDay() { return hireDay; }
	
	public void raiseSalary(double byPercent)
	{
		double raise= salary * (byPercent/100);
		salary +=  raise;
	}
	
	//Checks EQUALS:
	public boolean equals(Object otherObject)
	{
		if(this == otherObject) return true;
		
		if(otherObject == null) return false;
		
		if( getClass() != otherObject.getClass()) return false;
		
		//Now we know that object is a non-null Employee
		Employee other= (Employee) otherObject;
		return Objects.equals(name, other.name) && salary== other.salary && Objects.equals(hireDay, other.hireDay);
		
	}
	
	// HASHCODE: 
	public int hashCode()
	{
		return Objects.hash(name, salary, hireDay);
	}
	
	// toString:
	public String toString()
	{
		return getClass().getName() + "[name: " +name+ ",salary: "+salary+",hireDay: "+hireDay+"]";
	}
}
