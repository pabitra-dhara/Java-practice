import java.util.*;
public class markGrider {
public static void main(String args[]){
	System.out.print("Enter A Number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=2;i<=n;i++) {
		if(i%2==1) {
			System.out.print("Prime Number Is:");
			System.out.println(i);
		}
		else {
			System.out.print("Numbre is Not Prime:");
			System.out.println(i);
		}
	}
}
}
