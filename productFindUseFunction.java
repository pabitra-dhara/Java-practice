import java.util.*;
public class productFindUseFunction {
public static int productOfTwoNumber(int a,int b) {
	int mul=a*b;
	return mul;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int mul=productOfTwoNumber(a,b);
	System.out.println("2 Nunber Product Is:"+mul);	
}
}
