
package corejava;
import java.io.Console;

public class ConsoleDemo {
	public static void main(String[]args)
	{
	String str; char ch[];
	Console obj=System.console();
	System.out.print("enter the username:");
	str =obj.readLine();

	System.out.print("enter the Password:");
	ch=obj.readPassword();
	String a=String.valueOf(ch);
	System.out.print("username:"+str);
	System.out.print("Password:"+a);
	}
	}

