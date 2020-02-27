package Methods;

public class VaragsInputExample //variable arguments
{
	public int add(int ...input) 
	{
		int sum = 0;
		for (int i = 0; i < input.length; i++) 
		{
			sum += input[i];// Compound expression .
			//sum = sum + input[i];
		}
		return sum; 
	}
	public static void main(String[] args) 
	{
		System.out.println("sum : " +new VaragsInputExample().add(1,2,23,24,45,47,58,64,69,235));
    }
}
// array is always fix in size.so it is not preferred much .
//To over come this disadvantage we created collection frame works .