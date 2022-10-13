import java.util.*;
public class primeOrNotUseFunction {
public static void primeOrNot(int x) {
	if (x%2==0) {
		System.out.print("Number is Prime Number");
		return;
	}
	else {
		System.out.print("Number is Not Prime");
	}
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int x=sc.nextInt();
	primeOrNot(x);
}
}
