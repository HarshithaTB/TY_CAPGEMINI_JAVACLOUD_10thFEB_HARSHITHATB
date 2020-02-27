package Strings;
//
public class StringBufferEx {
	public static void main(String[]args) 
	{
		StringBuffer sb=new StringBuffer("Some stringbuffer");
		System.out.println(sb);
		System.out.println(sb.getClass());
		System.out.println(sb.length());
		//sb.append(" some");
		System.out.println(sb);
		//System.out.println(sb.reverse());
		//sb.replace(0, 1, "s");
		System.out.println(sb.replace(0, 1, "s"));
		//sb.insert(5, "ABC");
		System.out.println(sb.insert(5, "ABC"));
//		sb.indexOf("m");
		System.out.println(sb.indexOf("m"));
		System.out.println(sb.indexOf("xyz"));//if it is not there it will gives -1
		
		
		
	}

}
