package CoreJava;

public class ThreetypesofVariables {
	int a=10;// instance variables;

	static int b=5;// static variables;

	public static void main(String[]args)
	{
	int c=15;//local variables

	System.out.println("c="+c);
	System.out.println(ThreetypesofVariables.b);
	ThreetypesofVariables obj=new ThreetypesofVariables();
	System.out.println(obj.a);
	}
	}


