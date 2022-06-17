package corejava;
abstract class animal
{
	animal()
	{
		System.out.println("All animalse");
	}
	public abstract void sound();
}
class dog extends animal
{
	
	public void sound()
	
	{
		System.out.println("Dog is Barking");
	}
}
class lion extends animal
{
	public void sound()
	{
		System.out.println("Lione is Roar");
	}

	}

public class AbstractClassDemo {
	public static void main(String args[])
	{
		dog D=new dog();
		lion L=new lion();
		D.sound(); L.sound();
		
	}

}
