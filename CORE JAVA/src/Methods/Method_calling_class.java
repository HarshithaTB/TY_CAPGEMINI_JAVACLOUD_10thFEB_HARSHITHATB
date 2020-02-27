package Methods;
// if we want to CALL THE METHOD of OTHER CLASS we can call it with the help of CLASS NAME-STATIC METHOD  

public class Method_calling_class 
{
   public static void main(String[]args) 
{
	   int sum=Method_ex1.add(10, 20);
	   System.out.println("sum is" +sum);
	   System.out.println(" sub:" +Method_ex1.sub(10, 20));
	   System.out.println(" mul:" +Method_ex1.mul(10, 20));
	   System.out.println(" div:" +Method_ex1.div(20, 10));
	
}
	
}
