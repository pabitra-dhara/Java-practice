import java.util.*;
public class voteEligibal {
public static boolean eligibelOrNot(int age) {
	if (age>18) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Your age:");
	int x=sc.nextInt();
	System.out.println(eligibelOrNot(x));

}
}
