package corejava;
abstract class programming
{
	public abstract void Developer();
	public abstract void Rank();
	
}
 class HTML extends programming
 {
	 @Override
	 public void Developer()
	 {
		System.out.println("Tim Berners Lee");
	 }
	 @Override 
	 public void Rank() {
		 

	 System.out.println("3rd ");
	 }
 }
 class java extends programming
{
	 public void Developer()
	 {
		 System.out.println("James Gosling");
	 }
	public void Rank()
	{
		System.out.println("2nd");
	}
}
public class AbstractDemo {
	public static  void main(String[]args)
	{
		AbstractDemo A= new AbstractDemo();
		HTML h=new HTML();
		h.Developer();
		h.Rank();
		programming j=new java();
		j.Developer();
		j.Rank();
	
	}
}
