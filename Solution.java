import java.util.*;
public class Solution {
public static void getCircumference(double radius) {
	double circumference=2*3.14*radius;
	System.out.println("Answer:"+circumference);
return;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Radius:");
double redius= sc.nextDouble();
getCircumference(redius);
}
}
