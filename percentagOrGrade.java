import java.util.*;
public class percentagOrGrade {
public static float exNumber(float p,float b,float m,float c) {
	float total=(p+b+m+c);
	float n=4;
	float per=(total/n);
	if (per>=90) {
		System.out.println("Grade A");
	}
	else if(per>=80) {
		System.out.println("Grade B");
	}
	else if (per>=70) {
		System.out.println("Grade C");
	}
	else {
		System.out.println("Grade D");
	}	
	System.out.print("Percentag:");
	System.out.println(per);	
	return total;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	float p=sc.nextFloat();
	float b=sc.nextFloat();
	float m=sc.nextFloat();
	float c=sc.nextFloat();
	float total=exNumber(p,b,m,c);
}
}
