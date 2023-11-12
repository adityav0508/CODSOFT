import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in); 

		Random num= new Random();
		int i=1;
		int randomGen= num. nextInt(100);
		System. out. println("Random number between 1 and 100 has been generated. ");
		System.out.println();

		System.out.println("You have 3 attempts to guess the number..Guess number between 1 to 100.. Let's Start!!");

		while(i<=3){
		System.out.println("Enter Your #"+i +" guess for generated number : ");
		int guess=sc.nextInt();
		if(guess>randomGen)
		{
			System.out.println("your guess is high than random generated number..\n Bad luck!!");
		}
		else if(guess<randomGen)
		{
			System.out.println("Your guess is low than generated random number....\nBad Luck!!");
		}
		else if(guess==randomGen){
			System.out.println("Your guess is correct.. Congrats!!");
		}
		
		i=i+1;
			
	 }
	System.out.println("Your 3 attempts are over. The generated random number is : "+randomGen);
	}

}

