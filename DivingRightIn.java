// HEY I DID THIS AT HOME USING GIT!!!! YAY

package DivingRightIn;

import java.util.Scanner;

public class DivingRightin {

public static void main(String[] args) { 
	AskUserName();
	AskAgeAndBirth(); 
	UsersAgeInYears(); 
	AgeInDogYears(); 
	HowManyLeapYears();

	}

		

private static void AskUserName()
	{
	String importedName;
	Scanner name = new Scanner(System.in);		
	System.out.println("Hello! What is your name?");
	importedName = name.nextLine();
	System.out.println("Hello, " + importedName + "!");
	
		
	}

private static void AskAgeAndBirth()
	{
	
	Scanner age = new Scanner(System.in);
	System.out.println("How old are you?");
	nextInt ageOfUser = age.nextInt();
	
	
	if (ageOfUser < 16) 
	{
    System.out.println("Aw this is gonna be easy for me!");
	} 
	
	if else (ageOfUser == 17) 
	{
	System.out.println("Haha awesome so is my boss!");
	
	} 
	else (ageOfUser > 18) 
	{
	System.out.println("Oh man this might be a lot...");
	}
	
	
	}
private static void UsersAgeInYears()
	{
	
		
	}
private static void AgeInDogYears()
	{
		
		
	}
private static void HowManyLeapYears()
	{
		
		
	}
}