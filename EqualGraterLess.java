import java.util.*;
public class EqualGraterLess {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A Number:");
	int num=sc.nextInt();
	System.out.print("Enter B Number:");
	int num2=sc.nextInt();	
	if(num==num2) {
		System.out.println("Number is Equal!");
	}
	else if(num<num2) {
		System.out.println("Number A is Lessre!");
	}
	else {
		System.out.print("Number A Is Greater!");
	}
}
}
