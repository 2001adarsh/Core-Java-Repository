package filehandle;

import java.io.*;

public class Dataio {
	public static void main(String[] args) {
		try {
		String str="I am Adarsh";
		FileWriter fw= new FileWriter("F:output.txt");
		
		for(int i=0; i<str.length(); i++)
			fw.write(str.charAt(i));
		
		System.out.println("Writing Successful");
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try {
			int ch;
			FileReader fr= new FileReader("F:output.txt");
			
			while((ch=fr.read()) !=-1 )
				System.out.print((char)ch);
			
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
