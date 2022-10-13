import java.util.*;
public class linearSearchTwo {
public static void main() {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Array Size:");
	int size=sc.nextInt();
	int number[]=new int[size];
	System.out.print("Enter Array Element:");
	for(int i=0;i<size;i++) {
		number[i]=sc.nextInt();
	}
	System.out.print("Enter Searching Element:");
	int ser=sc.nextInt();
	for(int i=o;i<size;i++) {
		if(number[i]==ser) {
			System.out.print("Your Element Is Find Index Number:"+i);
			break;
		}
		else {
			System.out.print("Your Element Is Not Found");
		}
	}
}
return 0;
}
