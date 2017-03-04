import java.io.*;
public class S2A42
{
	public static void main(String args[]) throws Exception  //handling exception
    {
		int marks, age;
		System.out.println("Enter students' age");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //accept age 
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter students' marks");
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in)); //accept marks
		marks=Integer.parseInt(br1.readLine());
		if(age<15)  //checking age < 15
		{
			if(marks>60)
				System.out.println("You got Grade A");
			else if(marks>=45 && marks<=60)
				System.out.println("You got Grade B");
			else
				System.out.println("You got Grade C");
		}
		else
		{
			if(marks>70)
				System.out.println("You got Grade A");
			else if(marks>=61 && marks<=70)
				System.out.println("You got Grade B");
			else
				System.out.println("You got Grade C");
		}
			
		
	}
}