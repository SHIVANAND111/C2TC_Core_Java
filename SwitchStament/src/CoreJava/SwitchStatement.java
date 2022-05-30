package CoreJava;
import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[]args)
	{
		Scanner Sc=new 
		Scanner(System.in);
		System.out.println("choose the numbers");
		int number =Sc.nextInt();
		String colorenumber;
		
		switch(number)
		{
		case 1:
		colorenumber = "Black";
		break;
		case 2:
		colorenumber = "Blue";
		break;
		case 3:
			colorenumber = "Red";
	    break;
		case 4:
		colorenumber = "yellow";
		break;
		case 5:
			colorenumber = "white";
			break;
		default:
			colorenumber = "invalid";
			break;
		}
		System.out.println("you have selected the colore      "+""+colorenumber+"");
		}
		}


