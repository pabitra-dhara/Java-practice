import java.util.*;
public class sumOfNoddNumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A Number:");
	int n=sc.nextInt();
	int sum=0;
	
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			
		}
		else {
			sum=sum+i;
		}	
	}
	System.out.println("Sum of Odd Number is:"+sum);
}
}
