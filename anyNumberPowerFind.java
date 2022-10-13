import java.util.*;
public class anyNumberPowerFind {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter X Value:");
		int x=sc.nextInt();
		System.out.print("Enter N Value:");
		int n=sc.nextInt();	
		int ans=1;
		for (int i=1;i<=n;i++) {
			ans=ans*x;
		}
		System.out.print("Power Value:"+ans);
}
}
