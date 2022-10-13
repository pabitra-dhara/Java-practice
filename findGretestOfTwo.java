import java.util.*;
public class findGretestOfTwo {
public static void greter(int a,int b) {
	if(a>b) {
		System.out.println("A is greater");
	}
	else {
		System.out.println("B is greater");
	}
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter A Value:");
	int a=sc.nextInt();
	System.out.print("Enter B Value:");
	int b=sc.nextInt();
	greter(a,b);
}
}
