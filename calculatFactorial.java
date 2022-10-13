import java.util.*;
public class calculatFactorial {
public static void factorial(int num) {
	int factorial=1;
	if (num==0) {
		System.out.print("Invailed Input");
		return;
	}
	for(int i=num;i>=1;i--) {
		factorial=factorial*i;
	}
	System.out.println(num + "Factorial Is:"+factorial);
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A Number:");
	int num=sc.nextInt();
	factorial(num);
}
}
