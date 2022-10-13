import java.util.*;
public class covertDayToYearMonthDay {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Days:");
	int x=sc.nextInt();
	int year,month,weeks,days;
	
	//year find
	year=x/365;
	int z=x%365;
	//month find
	month=z/30;
	
	
	System.out.println("Year:"+year);
	System.out.println("Month:"+month);
	
}
}
