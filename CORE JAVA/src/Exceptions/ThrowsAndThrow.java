package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ThrowsAndThrow {

	public static void main(String[] args) throws Exception 
	{
		new Properties().load(new FileReader("application.properties"));
		System.out.println("Throws Exception");
	}

}
