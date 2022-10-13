import java.util.*;
public class elactricBill {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	double unit=sc.nextFloat();
	if(unit<=50) {
		double fst=unit*0.50;
		System.out.print(fst);
	}
	else if(unit<=150) {
		double sec=unit-50;
		double f=50*0.50;
		double s=sec*0.75;
		System.out.print(f+s);
	}+
	else{
		double fn=50*0.50;
		double fm=100*0.75;
		double last=unit-150;
		double ans=last*1.50;
		System.out.print(ans);
	}
}
}
