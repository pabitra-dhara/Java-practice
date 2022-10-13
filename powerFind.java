import java.util.*;
public class powerFind {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A Number:");
	int x=sc.nextInt();
	System.out.print("Enter Power Of A Number:");
	int y=sc.nextInt();
	int ans=1;
	for(int i=1;i<=y;i++) {
		ans*=x;
	}
	System.out.println(x+"^"+y+"="+ans);
}
}
