package Methods;
//A method can have only one return statement


public class Method_ex1 
{
	// we can write our own method by /**
	/**
	 * this method returns the sum of two given integers.
	 * 
	 * @param i
	 * @param j
	 * @return int i+int j
	 */

	 public static int add(int i,int j) //if there is no void then we need to write return type
		{
		 int sum=i+j;
	     return sum;
	   //if there is no void then we need to write return type
			
		}
	 /**
	  * this method returns difference of two number
	  * @param i
	  * @param j
	  * @return int i-int j
	  */
	 public static int sub(int i,int j)
	 {
		 return i-j;
	 }
	 /**
	  *  this method returns division of two number
	  * @param i
	  * @param j
	  * @return int i/ int j
	  */
	 
	 public static double div(int i,int j) 
	 
	 {
		return (i/j) *1.0;// it will returns double only
	 }
/**
 *  this method returns multiplication of two number
 * @param i
 * @param j
 * @return int i *  int j
 */
	 
	 public static int mul(int i,int j) 
	 {
		return i*j;
	 }
public static void main(String[]args) // main method
{
		 int sum=add(12,15);
		 System.out.println("sum is" +sum);
		 System.out.println("sum is" + add(10,20));
		 System.out.println("result is" + sub(10,20));
		 System.out.println("result is" + div(20,10));
		 System.out.println("result is" + mul(10,20));
		 
	 }
		
		
		
		
		
		

	

}
