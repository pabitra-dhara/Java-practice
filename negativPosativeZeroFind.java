import java.util.*;
public class negativPosativeZeroFind {
public static void allNumber(int x) {
	if(x<0) {
		System.out.print("Negative Number");
	}
	else if(x>0) {
		System.out.print("Posative Number");
	}
	else {
		System.out.print("Number Is Zero");
	}
return;
}
public static void main(String args[]) {
	System.out.print("Enter A Number:");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	allNumber(x);//call function
}
}
