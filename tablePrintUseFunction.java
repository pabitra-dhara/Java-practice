import java.util.*;
public class tablePrintUseFunction {
public static void table(int num) {
	for(int i=1;i<=10;i++) {
		System.out.print(num+"x"+i+"=");
		System.out.println(num*i);
	}
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter A Number:");
	int num=sc.nextInt();
	table(num);
}
}
