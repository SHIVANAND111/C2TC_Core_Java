package corejava;

public class MethodeOverriding {
	void show()
	{
		System.out.println("cant say anything");
	}
	class  MethodeOverriding2 extends  MethodeOverriding
	{
		@Override
		void show()
		{
			int a=10;
			super.show();
			System.out.println("yes right it is inherited"+a);
		}
		class test
		{
			public static void main(String[]args)
			{
				MethodeOverriding s =new MethodeOverriding();
				 s.show();
			}
			
		}
	}

}
