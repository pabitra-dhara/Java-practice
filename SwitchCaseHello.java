import java.util.*;
public class SwitchCaseHello {
public static void main(String args[]) {
	System.out.print("Enter 1-4 Any Number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	switch(num) {
	case 1: System.out.println("Hello!");
	break;
	case 2: System.out.println("Namaste!");
	break;
	case 3: System.out.println("Bonjour");
	break;
	case 4:System.out.println("Namaskar!");
	break;
	default: System.out.print("Invaild Input");
	}
}
}
