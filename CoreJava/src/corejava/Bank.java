package corejava;

public class Bank {
	float getRateOfInterest()
	{
	return 6.7f;
	}
	class SBI extends Bank
	{
	@Override
	float getRateOfInterest()
	{
	return 6.8f;
	}
	}
	class HDFC extends Bank {
	@Override
	float getRateOfInterest()
	{
	return 6.5f;
	}
	}
	public class MethodeOverridingDemo {
	public static void main(String[] args)
	{
	SBI obj = new HDFC();
	System.out.println(obj1.getRateOfInterest());
	}
	}

}
