import java.util.*;
public class primeOrNot {
public static void primeornot(int num) {
	for(int i=2;i<=num;i++) {
		if(num%i==0) {
			System.out.print("Number Is Not Prime");
			break;
		}
	}
	System.out.print("Prime");
	return;
} 
public static void main() {
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();
	primeornot(num);
}
}
