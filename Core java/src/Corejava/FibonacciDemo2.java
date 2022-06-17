package Corejava;
import java.util.Scanner;
public class FibonacciDemo2 {
public static void main(String[]args)
{
	int term,a=0,b=1,c;
	System.out.println("Enter th term");
	Scanner s=new Scanner(System.in);
	term=s.nextInt();
	for(int i=0;i<=term;i++)
	{
	c=a+b;
	
	System.out.println(c);
	a=b;
	b=c;
	
	}
}
}
