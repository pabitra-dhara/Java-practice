import java.util.*;
public class Functions {
		public static int calculateSum(int a,int b) {
			int sum=a+b;
			return sum;
		}
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st Number:");
	int a=sc.nextInt();
	System.out.print("Enter 2nd Number:");
	int b=sc.nextInt();
	int sum=calculateSum(a,b);
	System.out.println("Sum of 2 Numbers is:"+ sum);
}
}
