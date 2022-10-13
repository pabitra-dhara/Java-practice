import java.util.*;
public class evenOrOddUseFunction {
public static void evenOrNot(int num) {
	if (num%2==0) {
		System.out.print("Even Number!");
	}
	else {
		System.out.print("Odd Number!");
	}
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();
	evenOrNot(num);
}
}
