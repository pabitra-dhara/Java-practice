import java.util.*;
public class stringCompare {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Write any think for compare:");
	System.out.print("1st Statement:");
	String fast=sc.next();
	System.out.print("2nd Statement:");
	String secnd=sc.next();
	
	
	//compare 
	
	if(fast.compareTo(secnd)==0) {
		System.out.print("Equal");
	}
	else {
		System.out.print("Not Equal");
	}
}
}
