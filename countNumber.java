import java.util.*;
public class countNumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter Any Number:");
	int x=sc.nextInt();
	int count=0;
    while(x != 0){
        x=x/10;
        count++;
    }
    System.out.print("Total Number:" +count);
}
}