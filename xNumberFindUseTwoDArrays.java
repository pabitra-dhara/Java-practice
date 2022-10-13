import java.util.*;
public class xNumberFindUseTwoDArrays {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Rowes Size:");
	int rows=sc.nextInt();
	System.out.print("Enter Colums Size:");
	int cols=sc.nextInt();
	
	int[][]number=new int [rows][cols];
	
	//input
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			number[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	//out put
	System.out.print("Enter Your Searching Element:");
	int x=sc.nextInt();
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			if(x==number[i][j]) {
				System.out.println("X Found Index Number Is:("+i+","+j+")");
			}
		}
	}
}
}
