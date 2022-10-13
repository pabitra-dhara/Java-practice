import java.util.*;
public class printTableUseDoWhileloop {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	do {
		System.out.println(n);
		n--;
	}while(n>=0);
}
}
