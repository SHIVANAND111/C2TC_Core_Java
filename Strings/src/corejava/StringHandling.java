package corejava;

public class StringHandling 
	{
		public static void main(String[]args)
		{
			int i;
		String a="SHIVA";
		String b= new String("nanda");
		String c= "DRAIT";
		String d="        TECHNOSERVE   ";
		String e="";
		String f=a.substring(3,5);
		String g=c.substring(2);
		String sentance ="Hii welcome to technoserve training";
		char ch[]=sentance.toCharArray();
		for(i=0;i<sentance.length();i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(sentance.length());
		System.out.println(sentance);
		System.out.println(a.toLowerCase());

		System.out.println(b.toUpperCase());

		System.out.println(a.length());

		System.out.println(a.concat(b));

		System.out.println("THe index of A is="+c.indexOf('A'));

		System.out.println(d.trim());

		System.out.println(e.isEmpty());

		System.out.println(c.charAt(2));

		System.out.println(b.replace('v','.'));

		System.out.println(a.equals(b));
		System.out.println(f);
		System.out.println(g);
		}
		

}
