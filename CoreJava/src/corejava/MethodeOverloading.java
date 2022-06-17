package corejava;

public class MethodeOverloading {
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	float add(float a,float b)
	{
		return a+b;
	}
	float add(int a,float b,int c)
	{
		return a+b+c;
	}
	
	

	public static void main(String[] args) {
	
		
		MethodeOverloading obj=new MethodeOverloading();
		System.out.println(obj.add(20,25.35f));
		System.out.println(obj.add(10,25.25f,12));
		System.out.println(obj.add(1.2f,10.0f));
		obj.add(200,100);
		
		
	
		
		
		// TODO Auto-generated method stub

	}

}
