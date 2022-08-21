import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Managemt Applicatioin");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delate student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			int c= Integer.parseInt(br.readLine());
			
			if (c==1)
			{
				System.out.println("enter user name :");
				String name=br.readLine();
				System.out.println("Enter user phone:");
				String phone=br.readLine();
				System.out.println("Enter user city:");
				String city=br.readLine();
				
				Student st= new Student(name, phone,city);
				StudentDao.insertStudentToDB(st);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("student added successfully");
				}
				else
				{
					System.out.println("something went wroung try again ...");
				}
				System.out.println(st);
			}
			else if(c==2)
			{
			}
			else if(c==3) {
				
			}
			else if(c==4) {
				
				break;
			}
			else
			{
			}
		}
		System.out.println("thank you for using my application ");
		System.out.println(" see you soon ..... bye bye .. tata tata");
	
		
	}

}
