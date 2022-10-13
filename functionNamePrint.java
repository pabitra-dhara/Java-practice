import java.util.*;
public class Functions{
	public static void functionNamePrint(Stirng name) {
		System.out.println(name);
		return;
	}
public static void main(String args[])	{
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	functionNamePrint(name);//call function
}
}


