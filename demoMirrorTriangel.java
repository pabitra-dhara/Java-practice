import java.util.*;
public class demoMirrorTriangel {
public static void main(String args[]) {
	int n=5;
	for(int j=n;j>=1;j--) {
		for(int i=j;i>=1;i--) {
			System.out.print("*");
		}
		for(int i=8;i<=1;i--) {
			System.out.print(" ");
		}
		for(int i=j;i>=1;i--) {
			System.out.print("*");
		}
		System.out.println(" ");

	}
}
}
