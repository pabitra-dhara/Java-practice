import java.util.*;
public class UseForloopTable {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N Number:");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.print(n+"x"+i+"=");
			System.out.println(n*i);
		}	
	}
	}


