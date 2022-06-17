package corejava;

public class MethodeOverloading2 {
	
int add(int a,int b)
{
	int c=a+b;
	return c;
}
void add(float x,float y,int z)
{
	System.out.println(x+y-z);
}
void add(int d,float e,int f)
{
	System.out.println(d-e-f);
}

	public static void main(String[]args)
	{
		MethodeOverloading2 s= new MethodeOverloading2();
		s.add(10.0f,20.2f,14);
		s.add(10,25.2f,1);
		System.out.println(s.add(25,58));
		
		
		
		
	}
}

