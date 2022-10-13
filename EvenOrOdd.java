import java.util.*;
public class EvenOrOdd {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A number:");
	int x=sc.nextInt();
	if(x%2==0) {
		System.out.println("It is Even Number!");
	}
	else {
		System.out.print("It is Odd Number!");
	}
}
}
