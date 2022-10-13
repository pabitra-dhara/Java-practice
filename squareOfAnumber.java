import java.util.*;
public class squareOfAnumber {
public static int square(int num) {
	int ans=num*num;
	return ans;
}
public static void main(String args[]) {
	Scanner sc	= new Scanner(System.in);
	System.out.print("Enter A Number:");
	int num=sc.nextInt();
	int ans=square(num);
	System.out.print("Answer:");
		System.out.print(ans);	

}
}
