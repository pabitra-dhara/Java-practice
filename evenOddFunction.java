import java.util.*;
public class evenOddFunction {
public static void evenOdd(int num) {
	if(num%2==0) {
		System.out.print("Number is Even");
		return;
	}
	else {
		System.out.print("Number is Odd");
	}
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int x=sc.nextInt();
	evenOdd(x);
}
}
