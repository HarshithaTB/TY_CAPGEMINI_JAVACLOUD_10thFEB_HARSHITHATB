package Strings;

public class StringsExample 
{
	public static void main(String[]args) 
	{
		String str1="some string";
		String str2=new String ("some other string");
		String str3="some other string";
		String str4="some string";
		String str5=new String("some other string");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		
		System.out.println("String1==String4:"  + str1.equals(str4)) ;
		System.out.println("String2==String3:"  + str2.equals(str3)) ;
		
		
		
	}

}
