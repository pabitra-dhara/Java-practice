import java.util.*;
public class swapTwoNumber {
public static void swapNo(int x,int y) {
	int z=x;
	x=y;
	y=z;	
	System.out.print("1st Number Value Is:");
	System.out.println(x);
	System.out.print("2nd Number Value Is:");
	System.out.println(y);		
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter 1st Number:");
	int x=sc.nextInt();
	System.out.print("Enter 2nd Number:");
	int y=sc.nextInt();
	
	swapNo(x,y);
}
}
