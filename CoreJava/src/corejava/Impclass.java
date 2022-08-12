package corejava;
interface i1
{
void set(int x, int y);
}
interface i2
{
void disp();
}
class Impclass implements i1,i2
{
int p=10;
int q=20;
@Override
public void set(int x,int y)
{
this.p=x;
this.q=y;}
public void incr()
{
this.p+=1;
this.q+=1;
}
@Override
public void disp()
{
System.out.println(this.p);

System.out.println(this.q);
}
}

 class Interfacedemo{
	public static void main(String []args)
	{
	Impclass s1= new Impclass();
	s1.disp();
	s1.set(23,57);
	s1.disp();
	s1.incr();
	s1.disp();
	}

}
