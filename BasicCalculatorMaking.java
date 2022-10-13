import java.util.*;
public class BasicCalculatorMaking {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st Number:");
	int num1=sc.nextInt();
	System.out.print("Enter 2nd Number:");
	int num2=sc.nextInt();
	System.out.print("Enter Operation:");	
	char x=sc.next().charAt(0);
	//operator scan
	switch(x){
		case '+':System.out.print("Addtion:");
			System.out.println(num1+num2);
		break;
		case '-':System.out.print("Subtraction:");
			System.out.println(num1-num2);
		break;
		case '*':System.out.print("Multipicasan:");
			System.out.println(num1*num2);
		break;
		case '/': int ans;
		double rem;
		ans=num1/num2;
		rem=num1%num2;
		System.out.print("Answer:");
		System.out.println(ans);
		System.out.print("Reminder:");
		System.out.print(rem);
		break;
		default:System.out.print("Invaled In put!");
	}
}
}
