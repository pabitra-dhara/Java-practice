import java.util.*;
public class simpleIntresCalculator {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter P Value:");
	float p=sc.nextFloat();
	System.out.print("Enter T Value:");
	float t=sc.nextFloat();
	System.out.print("Enter R Value:");
	float r=sc.nextFloat();
	float si=(p*t*r)/100;
	System.out.print("Simple Intrest is:"+si);
}
}
