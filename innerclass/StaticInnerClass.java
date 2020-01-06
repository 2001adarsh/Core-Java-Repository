package innerclass;
/**
 * You may want to use inner class simply to hide one class inside another-- but you don't need the inner class to have a 
 * reference to the outer class object. You can suppress the generation of that reference by declaring the inner class Static.
 * 
 * therefore, the object of a static inner class does not have a reference to the outer class object that generated it.
 * similar to what it is like NESTED CLASSES in c++.
 * 
 * -> It can have static fields and methods.
 * @author Adarsh
 *
 */
public class StaticInnerClass {
	public static void main(String[] args)
	{
		double[] d= new double[20];
		for(int i=0; i<d.length; i++)
			d[i]= 100 * Math.random();
		for(double v: d)
			System.out.print(v+" ");
		System.out.println();
		ArrayAlg.Pair p= ArrayAlg.Pair.minmax(d);
		System.out.println("min= "+ p.getFirst());
		System.out.println("max= "+ p.getSecond());
	}
}

class ArrayAlg{
	
	public static class Pair{
		
		private double first;
		private double second;
		
		public Pair(double f, double s)
		{
			first= f;
			second=s;
		}
		
		public double getFirst()
		{
			return first;
		}
		
		public double getSecond() 
		{	
			return second;
		}
		/**
		 * Function.
		 * @param values an array of random floating point numbers.
		 * @return a pair whose first element is the minimum and whose second element is the maximum.
		 */

		public static Pair minmax(double[] values)
		{
			double min= Double.POSITIVE_INFINITY;
			double max= Double.NEGATIVE_INFINITY;
			for(double v: values)
			{
				if(min > v) min=v;
				if(max < v) max= v;
			}
			return new Pair(min,max);
		}
	}
}

