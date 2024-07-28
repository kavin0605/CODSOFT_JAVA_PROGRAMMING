package number;

import java.util.Scanner;
 


public class gradecalculation {

	
		public static void main(String[] args)
		{

			Scanner s = new Scanner(System.in);
			System.out.println("\t \t \t ******** WELCOME TO STUDENT GRADE CALCULATIONS********");
		    System.out.print("Enter student name: ");
		    String k=s.nextLine();
		    System.out.print("Enter rollnumber: ");
		    String r=s.nextLine();
			System.out.println("Fill The "+ k+"'s"+" Five Subject Marks:");
			System.out.print("Enter the number of subjects: ");
		    int n = s.nextInt();

			 int[] marks = new int[n];
		        int total = 0;
		       
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter the marks for Subject " + (i + 1) + ": ");
		            marks[i] = s.nextInt();
		            if(marks[i]<=100)
		            {
		            total += marks[i]; 
		            }
		            else
		            {
		                System.out.println("INVALID INPUT");
		            }
		        }
		        
			float p = (float)total/n;
			System.out.println("\n"+"name: "+k);
			System.out.println("Rollno: "+r);
			System.out.println("Total: "+total);
			System.out.println("percentage: "+String.format("%.2f",p));	
			if(p>=90)
				System.out.println("Grade A  (excellent)");
			else if(p>=80)
				System.out.println("Grade B (good)");
			else if(p>=70)
				System.out.println("Grade C (super)");
			else if(p>=60)
				System.out.println("Grade D (improve)");
			else if(p>=40)
				System.out.println("Grade E (very bad)");
			else 
				System.out.println("Grade F (worst)");


	}

}
