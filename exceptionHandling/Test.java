package exceptionHandling;
/**
 * Unchecked Exception -> Internal Error and RunTime Exception (as its the programmers fault).
 * Checked Exception -> All the other exception.
 * 
 * Runtime Exception - denotes logical errors like ArrayIndexOutOfBounds and NullPointerException.
 * NonRuntime Exception - errors by unpredictable problems.
 * 
 * should not advertise any exceptions form Unchecked Exceptions.
 * for checked exceptions, eg.
 * 	class Animation
 * 		public Image loadImage(String s) throws FileNotFoundException, EOFException //for multiple exceptions
 * 
 * Caution: IF YOU OVERRIDE A METHOD FROM SUPERCLASS, THE CHECKED EXCEPTION THAT SUBCLASS METHOD CONTAINS
 * CANNOT DECLARE AN EXCEPTION ("THROWS") IF SUPERCLASS DOES NOT THROW ANY.
 * 
 * You either use Try Catch Blocks or throws on method.
 * When u know how to handle the exception use Try Catch Block otherwise propagate an exception using throws specifier
 *  
 *  e.getMessage() - to get details of the error
 *  e.getClass().getName() - to get the actual type of the exception object.
 *  
 *  -> Can catch multiple exception types.
 *  	For eg. for missing files and unknown host, the action is same then,
 *  	try{ code that might throw exception }
 *  	catch( FileNotFoundException | UnknownHostException e) { code to manage }
 *  	catch (IOException e) { code for action on I/O problems }
 * 
 * 
 * @author Adarsh
 *
 */
public class Test {

}

/** 
 * 	java.lang.Throwable
 * 	Throwable() - constructs a new Throwable object with no detailed message.
 * 	Throwable(String message) - with specified detailed message.
 * 	String getMessage() - get detailed message of the Throwable object.
 * 
 * Try catch block.
 * 	if none of the code inside the try block throws an exception of  a type other than named in catch clause
 * 	this method exits immediately.
*/