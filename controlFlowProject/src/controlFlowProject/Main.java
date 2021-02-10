package controlFlowProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
//		System.out.println("Numbers:");
//		AsciiChars.printNumbers();
//		System.out.println("Lowercase letters:");
//		AsciiChars.printLowerCase();
//		System.out.println("Uppercase letters:");
//		AsciiChars.printUpperCase();
		
		ArrayList<String> questions = new ArrayList<>();

		questions.add("What is your pet's name?");
		questions.add("What is the 2-digit year of your car?");
		questions.add("What is your high school mascot?");
		questions.add("Name a state in the US");
		questions.add("Name a country you want to visit");
		questions.add("Pick a random number between 1 - 50");
		questions.add("What is your favorite number?");
		
		ArrayList<String> answers = new ArrayList<>();
		ArrayList<Integer> jackpot = new ArrayList<>();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s\n", inputName);
		
		System.out.println("Do you wish to continue to the interactive portion? (y/n)");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
			// need to add the survey questions
			for (String question : questions) {
				System.out.println(question);
				String resp = userInput.nextLine();
				answers.add(resp);
			}
			userInput.close();
		} else { // anything other than y or yes response goes to exit
			System.out.printf("Okay %s, please return later to complete the survey.\n", inputName);
			userInput.close();
			System.exit(0);
		}
		jackpot = genNumbers(answers);
		
		//Output the result to the console for the user
		System.out.print("Your lottery numbers are: ");
		
		for(Integer lottoNumber : jackpot) {
			if(jackpot.indexOf(lottoNumber) < jackpot.size()-1) {
				System.out.printf("%d, ", lottoNumber);
			} else {
				System.out.printf("and the Magic Ball is: %d", lottoNumber);
			}
		}
		
	}
	
	private static ArrayList<Integer> genNumbers(ArrayList<String> ansStrings) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//Generate random numbers for use later:
		Random random = new Random();
		Integer randOne = random.nextInt(75)+1;
		Integer randTwo = random.nextInt(75)+1;
		Integer randThree = random.nextInt(75)+1;
		
		//Get the int value for the third letter of the pet's name,
		//unless the pet's name is less than three letters long then
		//get the first letter, make the value between 1 - 65,
		//put the result in first position of the ArrayList numbers
		Integer numZero = 0;
		if(ansStrings.get(0).length() > 2) {
			Character charZero = ansStrings.get(0).charAt(2);
			numZero = Character.getNumericValue(charZero);
		} else {
			Character charZero = ansStrings.get(0).charAt(0);
			numZero = Character.getNumericValue(charZero);
		}
		while(numZero < 1 || numZero > 65) {
			if(numZero < 1) {
				numZero += 23;
			} else if(numZero >65) {
				numZero -= 17;
			}
		}
		numbers.add(numZero);
		
		//Get the two digit value of the car's year
		//add the favorite number and make the value
		//between 1 - 65, put the result in the second
		//position of the ArrayList numbers
		Integer numOne = Integer.parseInt(ansStrings.get(1)) + Integer.parseInt(ansStrings.get(6));
		while(numOne > 65) {
			numOne -= 35;	
		}
		numbers.add(numOne);
		
		//Get the user's random number between 1-50,
		//subtract random number 'randOne' from it,
		//make the value between 1 - 65, put the result
		//in the third position of the ArrayList numbers
		Integer numTwo = Integer.parseInt(ansStrings.get(5)) - randOne;
		while(numTwo < 1) {
			numTwo += 10;
		}
		numbers.add(numTwo);
		
		//Get the int value of the first letter of the high school
		//mascot, add randTwo then make the value between 1-65, 
		//put the result in the fourth position of the ArrayList numbers
		Integer numThree = Character.getNumericValue(ansStrings.get(2).charAt(0)) + randTwo;
		while(numThree > 65) {
			numThree -= 22;
		}
		numbers.add(numThree);
		
		//Get the int value of the first letter of the country to visit,
		//add the int value of the last letter of the US state,
		//then make the value between 1-65, put the result in the 
		//fifth position of the ArrayList numbers
		Integer numFour = 0;		
		numFour = Character.getNumericValue(ansStrings.get(4).charAt(0)) + Character.getNumericValue(ansStrings.get(3).charAt(ansStrings.get(3).length()-1));
		while(numZero > 65) {
			numZero -= 33;
		}
		numbers.add(numFour);
		
		//sort the numbers ArrayList in ascending order
		Collections.sort(numbers);
		
		//Get the user's favorite number, add randOne, subtract randTwo,
		//add randThree, force the value between 1-75 for the 'magic ball'
		//put the result in the last (sixth) position of the ArrayList numbers
		Integer magicNum = Integer.parseInt(ansStrings.get(6)) + randOne - randTwo + randThree;
		while(numThree > 75) {
			numThree -= 51;
		}
		numbers.add(magicNum);
		
		//finally return the assembled numbers ArrayList
		return numbers;
	}

}