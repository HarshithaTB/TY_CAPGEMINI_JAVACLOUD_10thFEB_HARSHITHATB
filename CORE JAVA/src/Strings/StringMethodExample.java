package Strings;

public class StringMethodExample {
	public static void main(String[]args) {
		String str1="some string";
		String str2="";
		String str3="sOmE sTrInG";
		
		System.out.println("Length of the string is " + str1.length());
		System.out.println("Length of the string is " + str2.length());
		
		System.out.println("isEmpty() of string " + str1.isEmpty());
		System.out.println("isEmpty() of string " + str2.isEmpty());
		
//		str1.charAt(3);
//		str2.charAt(5);
		System.out.println(str1.charAt(3));
		//System.out.println(str2.charAt(0));//StringIndexOutOfBoundsException:
		System.out.println("charAt() of String "  + str1.charAt(5));
		System.out.println("charAt() of String "  + str1.charAt(str1.length()-2));
		System.out.println("charAt() of string "  + str1.equals(str3));
		String str4=str1.concat(" concatinated string");
		System.out.println(str4);
		System.out.println(str1);
		String str5=str1.replace('s', 'S');
		System.out.println("replaced statement is " + str5);
		//convert data into string is 
		
		String str6 = String.valueOf(2);
		System.out.println(str6);
		System.out.println(str3.toUpperCase());
		System.out.println(str1.substring(2));//it will exclude 2 cage from beginning
		System.out.println(str1.substring(2, 6));
		System.out.println(str1.startsWith("s"));
		System.out.println(str3.endsWith("I"));
		System.out.println(str1);//the value of the string is immutable .
		//it wont changes if we perform any operations.
	}

}
