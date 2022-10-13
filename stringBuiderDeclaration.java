import java.util.*;
public class stringBuiderDeclaration {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in) ;
		StringBuilder sb=new StringBuilder("Pabitra");
		System.out.println(sb);	//Stringbuilder print
		System.out.println(sb.charAt(0));//set char at index
		sb.setCharAt(0, 'S');
		System.out.println(sb);//set char at index
		sb.insert(0, 'P');//inser at char 
		System.out.println(sb);	
		sb.delete(2,5);//delete some thing in char
		System.out.println(sb);
}
}
