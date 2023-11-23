import java.util.Scanner;

public class converter
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 for Rupee to Dollar conversion: ");
        System.out.println("Type 2 for Dollar to Rupee conversion: ");
	System.out.println("Type 3 for Rupee to Australian dollor conversion: ");
	System.out.println("Type 4 for Australian dollor to Rupee conversion: ");	
	System.out.println("Type 5 for Rupee conversion to Bitcoin : ");
	System.out.println("Type 6 for Bitcoin to Rupee conversion: ");

        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
            System.out.print("Enter rupee amount: ");
            double r1 = in.nextDouble();
            double d1 = r1 / 77;
            System.out.println(r1 + " rupees => " + d1 + " dollars");
            break;
            
            case 2:
            System.out.print("Enter dollar amount: ");
            double d2 = in.nextDouble();
            double r2 = d2 * 77;
            System.out.println(d2 + " dollars => " + r2 + " rupees");
            break;

	    case 3:
	    System.out.print("Enter rupee amount: ");
            double d4 = in.nextDouble();
            double r4 = d4 * 0.01835;
            System.out.println(d4 + " rupee => " + r4 + " australian dollar");
            break;

	    case 4:
            System.out.print("Enter Australian dollar amount: ");
            double d3 = in.nextDouble();
            double r3 = d3 /0.01835;
            System.out.println(d3 + " Australian dollar => " + r3 + " rupee ");
            break;

	   case 5:
            System.out.print("Enter Rupee amount: ");
            double d5 = in.nextDouble();
            double r5 = d5/3107262.36132;
            System.out.println(d5 + " rupee => " + r5 + " Bitcoin ");
            break;

	   case 6:
            System.out.print("Enter Bitcoin amount: ");
            double d6 = in.nextDouble();
            double r6 = d6*3107262.36132;
            System.out.println(d6 + " bitcoin => " + r6 + " rupee ");
            break;
            
            default:
            System.out.println("Incorrect Choice");
        }
    }
}