import java.util.*;
public class transposePrintUseTwoDArrays {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int[][]number=new int[m][n];
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			number[i][j]=sc.nextInt();
		}
	}
	System.out.println("Transpose Is:");
	
	for(int j=0;j<n;j++) {
		for(int i=0;i<m;i++) {
			System.out.print(number[i][j]);
		}
		System.out.println();
	}
}
}
