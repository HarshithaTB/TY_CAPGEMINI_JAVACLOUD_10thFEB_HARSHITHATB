package Controlfun;//control flow statement

public class IfExample {

	public static void main(String[] args) {

		int age=17;
		String day= "monday";
		
		
		System.out.println("*************if statement*******************");
//if statement.........................................................
		if(age >=18)
		{
			System.out.println(" person can vote");
		
		}
		System.out.println("out of if block");
		
//if-else statement....................................................
		System.out.println("*************if-else statement*******************");
		if(age >=18)
		{
			System.out.println(" person can vote");
		
		}
		else {
			System.out.println("person can't vote");
		}
//without brackets.....................................................
		System.out.println("*************if statement(without brackets)*********");
		if(age >=18)
		
			System.out.println(" person can vote");
	
		else 
			System.out.println("person can't vote");
//Else if statement.....................................................
		System.out.println("*************else-if statement*******************");
	if(age<30)
		{
			System.out.println("not a Teen age");
			
		}
		else if(age>=10&& age<=19)
		{
			System.out.println("Teen age");
			
		}
		else
		{
			System.out.println("its is a Teen age");
		}
//Switch case................................................................
	        System.out.println("*************switch statement*******************");
	  switch(day) {
	  case "monday":
	    System.out.println("weekday");
	  break;
	  case "tuesday":
		System.out.println("weekday");
		break;
	  case "wednesday":
		System.out.println("weekday");
		break;
	  case "thursday":
		System.out.println("weekday");
		break;
	  case "friday":
		System.out.println("weekday");
		break;
	  case "saturday":
		System.out.println("weekend");
		break;
	  case "sunday":
		System.out.println("weekend");
		break;
	  default:
		System.out.println("invalid");
			break;
	
	
	}
}

}
