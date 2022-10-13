import java.util.*;
public class UseForloopPrintNEvenNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 To N Number Valu:");
		int n=sc.nextInt();
		
		System.out.println(1 + "-" + n +"All Even Number Is:");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
