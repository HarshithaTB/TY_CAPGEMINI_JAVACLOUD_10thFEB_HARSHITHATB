
public class Operator {
	public static void main(String[] args)
	{
		int i =10;//assignment operator
		int j=20;
		int k=30;
		System.out.println("****** And operator*******");
		System.out.println((i>j)&&(j>k));
		System.out.println((i<j)&&(j<k));
		System.out.println((i<j)&&(j>k));
		System.out.println((i>j)&&(j<k));
		
		System.out.println("****** Or operator*******");
		
		System.out.println((i>j)||(j>k));
		System.out.println((i<j)||(j<k));
		System.out.println((i<j)||(j>k));
		System.out.println((i>j)||(j<k));
		
		System.out.println("****** Not operator*******");
		
		System.out.println(j!=k);// used only for EQUALS operator
		System.out.println("*******compound assignment operator *******");
		System.out.println(i+=10);//i=i+10
		System.out.println(i*=20);
		System.out.println(i-=30);
		System.out.println(i/=10);
		
		System.out.println("****** Ternary operator*******");
		
		System.out.println(i+j*k);
		
		int result=(i>j)?(i+j):(i-j);
		System.out.println(result);
		System.out.println((i>j)?("i is greater than j"):("i  is not equal to j"));
		
		
		
	}

}
