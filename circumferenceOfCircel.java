import java.util.*;
public class circumferenceOfCircel {
public static double find(double redius) {
	double cicumference;
	double a=2,pi=3.14,
	redius=a*pi*redius;
	return redius;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Circel Redius:");
	double redius=sc.nextDouble();
	double cicumference=find(redius);
	System.out.println(redius);
}
}
