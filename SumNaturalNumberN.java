import java.util.*;
public class SumNaturalNumberN {
	public static void main(String args[]) {
	System.out.print("Enter N Value:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++) {
		sum=sum+i;
	}
	System.out.print(sum);
	}
}