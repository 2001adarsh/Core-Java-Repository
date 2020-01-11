package filehandle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class hero implements Serializable{
	public int rollno;
	public String name;
	
	hero(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
}

public class Objectio {
	public static void main(String[] args) throws Exception
	{
		serialise();
		deserialise();
	}
	public static void serialise() throws Exception
	{
		hero dem= new hero(18,"Adarsh");
		FileOutputStream fs = new FileOutputStream("D:object.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(dem);
		os.close();
	}
	public static void deserialise() throws Exception
	{
		FileInputStream fin = new FileInputStream("D:object.txt");
		ObjectInputStream is = new ObjectInputStream(fin);
		hero ans= (hero)is.readObject();
		fin.close();
		is.close();
		System.out.println("Name: "+ ans.name);
		System.out.println("Rollno."+ ans.rollno);
	}
}
