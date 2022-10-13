import java.util.*;
public class sumOfSeries {
public static void series(int num) {
	int f=1;
	for(int i=num;i>=1;i--) {
		for(int y=i;y>=1;y--) {
			f=f*i;	
			int ans=f/num;
		}
		int z=z+ans;
	}
	System.out.print(z);
	return;
}
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();
	series(num);
}
}