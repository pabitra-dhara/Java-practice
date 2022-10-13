import java.util.*;
public class linearSearch {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Array Size:");
	int size=sc.nextInt();
	System.out.print("Enetr Element:");
	int number[]=new int[size];
	
	//input 
	for(int i=0;i<size;i++) {
		number[i]=sc.nextInt();
	}
	
	System.out.print("Enter Your Searching Element:");
	int x=sc.nextInt();
	
	for(int i=0;i<size;i++) {
		if(number[i]==x) {
			System.out.println("Number Is Find Index No:"+i);
		}
	}
}
}
