// HEY I DID THIS AT HOME USING GIT!!!! YAY




import java.util.Scanner;

public class DivingRightIn {

public static void main(String[] args) { 
	//AskUserName(); 
	AskAgeAndBirth();
	AgeInDogYears();
	HowManyLeapYears();
}

private static void AskUserName()
	{
	Scanner name = new Scanner(System.in);		
	System.out.println("Hello! What is your name?");
	String importedName = name.nextLine();
	System.out.println("Hello, " + importedName + "!");
	
		
	}

private static void AskAgeAndBirth()
	{	
	Scanner age = new Scanner(System.in);
	System.out.println("How old are you?");
	int ageOfUser = age.nextInt();
	
	
	if (ageOfUser < 16) 
		{
	    System.out.println("Aw this is gonna be easy for me!");
		} 
		
		if (ageOfUser == 17) 
		{
		System.out.println("Haha awesome so is my boss!");
		
		} 
		if (ageOfUser > 18) 
		{
		System.out.println("Oh man this might be a lot...");
		}
	
	Scanner year = new Scanner(System.in);
	System.out.println("What year were you born in?");
	int inportedYear = year.nextInt();
	
	for(int x = 0; x <= ageOfUser; x++)
		       {
		       System.out.println("In " + (inportedYear + x) + " you were " + x);
		       }
	
		
	
		
	}
private static void AgeInDogYears()
	{
		
		
	}
private static void HowManyLeapYears()
	{
		
		
	}
}