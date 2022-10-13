import java.util.*;
public class twoDArrayScanAndPrint {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter Rowes Size:");
	int rows=sc.nextInt();
	System.out.print("Enter Colums Size:");
	int cols=sc.nextInt();
	
	int [][]number=new int [rows][cols];
	
	//input
	System.out.println("Enter Array Element:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			number[i][j]=sc.nextInt();
		}
	}
	//output
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(number[i][j]);
		}
		System.out.println();
	}
}
}
