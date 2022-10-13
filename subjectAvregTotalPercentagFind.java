import java.util.*;
public class subjectAvregTotalPercentagFind {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Bengali Marks:");
	float b=sc.nextFloat();
	System.out.print("Enter English Marks:");
	float e=sc.nextFloat();
	System.out.print("Enter Education Marks:");
	float ed=sc.nextFloat();	
	System.out.print("Enter Geography Marks:");
	float g=sc.nextFloat();	
	System.out.print("Enter Sanaskit Marks:");
	float s=sc.nextFloat();	
	float total=(b+e+ed+g+s);
	float avr=(total/5);
	float par=(total/500)*100;
	System.out.println("Total Marks:"+total);
	System.out.println("Average:"+avr);
	System.out.println("Percentage:"+par+"%");
}
}
