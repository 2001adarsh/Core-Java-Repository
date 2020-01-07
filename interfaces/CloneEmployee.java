package interfaces;

import java.util.Date;
import java.util.GregorianCalendar;

public class CloneEmployee implements Cloneable {
	private String name;
	private double salary;
	private Date hireDay;
	
	public CloneEmployee(String name, double salary)
	{
		this.name= name;
		this.salary= salary;
		hireDay= new Date();
	}
	public CloneEmployee clone() throws CloneNotSupportedException
	{	
		//call object.clone()
		CloneEmployee cloned= (CloneEmployee) super.clone();
		
		//clone mutable fields.
		cloned.hireDay= (Date) hireDay.clone();
		return cloned;
	}
	
	/**
	 * Set the hire day to a given date.
	 * @param year of hire day
	 * @param month
	 * @param day
	 */
	public void setHireDay(int year, int month, int day)
	{
		Date newHireDay= new GregorianCalendar(year, month-1, day).getTime();
		
		//Example of instance field mutation
		hireDay.setTime(newHireDay.getTime());
	}
	public void raiseSalary(double byPercent)
	{
		double raise= salary * byPercent /100;
		salary+= raise;
	}
	public String toString()
	{
		return "Emloyee [name: "+name+" ,salary: "+salary+" ,hireDay: "+hireDay+"]";
	}
}
