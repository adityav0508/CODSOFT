import java.util.*;

public class StudentGrade
{

	public static void main(String args[]){
		
		int total=0;
		float avg;
		

		Scanner sc=new Scanner(System.in);
		System.out.println("!!!....Welcome to Student Grade Calculator....!!!");

		System.out.println("Enter how many subjects you have ??");
		int sub=sc.nextInt();
		 int outof= 100*sub;
		System.out.println("Enter "+sub+" subjects marks out of 100: \n");
		
		for(int i=1;i<=sub;i++)	
		{
			System.out.println("\nEnter "+i +" subject Marks :");
			int mark=sc.nextInt();
			total=total+mark;
		}
		
		
		System.out.println("Total marks : "+total +" Out of "+outof);
		avg=total / sub;

		System.out.println("Percentage = "+avg);

		if(avg>=90)
		{
			System.out.println("A+ Grade - Exceptional");
		}
		else if(avg>=80 && avg<90){
			System.out.println("A grade - Excellent");
		}
		else if(avg>=70 && avg<80){
			System.out.println("B grade - Good");
		}
		else if(avg>=60 && avg<70){
			System.out.println("C grade - Satisfactory");
		}
		else if(avg>=45 && avg<60){
			System.out.println("D grade - Barely acceptable");
		}
		else{
			System.out.println("Fail....");
		}
	
	}
}