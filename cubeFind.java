import java.util.*;
public class cubeFind {
public static int cube(int x) {
	int ans=x*x*x;
	return ans;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int x=sc.nextInt();
	int ans=cube(x);
	System.out.print(ans);
}
}
