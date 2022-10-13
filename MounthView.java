import java.util.*;
public class MounthView {
public static void main(String args[]) {
	System.out.print("Enter month Number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	switch(num) {
	case 1:System.out.print("January");
	break;
	case 2:System.out.print("February");
	break;
	case 3:System.out.print("March");
	break;
	case 4:System.out.print("April");
	break;
	case 5:System.out.print("May");
	break;
	case 6:System.out.print("Jun");
	break;
	case 7:System.out.print("Julay");
	break;
	case 8:System.out.print("Augest");
	break;
	case 9:System.out.print("Septembor");
	break;
	case 10:System.out.print("Octobor");
	break;
	case 11:System.out.print("November");
	break;
	case 12:System.out.print("Decembar");
	break;
	default:System.out.print("Invalid Input!");
	}
}
}
