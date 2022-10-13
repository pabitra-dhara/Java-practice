import java.util.*;
public class sumOfoddNumberUseFunction {
public static int oddOfSum(int n) {
	int sum=0;
	
	for(int i=1;i<=n;i++) {
		if(i%2 !=0) {
			sum=sum+i;
		}
	}
	return sum;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter A Number:");
	int n=sc.nextInt();
	int sum=oddOfSum(n);
	System.out.println("Sum Of Odd Number is:"+sum);
}
}
