import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args){
	
		System.out.println("Welcome to the main menu");
		System.out.println("this is where I'll be placing my leetcode trials");
		System.out.println("Things to do: Make a capable main menu \n");
		
		System.out.println("a) Common Characters");
		System.out.println("b) Common Characters with Double Array");
		System.out.println("c) Divisor Game");
		System.out.println("d) Duplicate Zeros");
		System.out.println("e) Fizz Buzz");
		System.out.println("f) Keyboard Row");
		System.out.println("g) Reverse String");
		System.out.println("h) Two Sum");
		
		System.out.println("Please make a selection: \n a: CommonCharacters \n b: DoubleCommon \n ");

		Scanner input = new Scanner(System.in);
		String choice;
		
		choice = input.next();
		
		switch(choice){
		case "a":
			CommonCharacters.main(args);
			break;
		case "b":
			CommonCharactersDoubleArray.main(args);
			break;
		case "c":
			DivisorGame.main(args);
			break;
		case "d":
			DuplicateZeros.main(args);
			break;
		case "e":
			FizzBuzz.main(args);
			break;
		case "f":
			KeyboardRow.main(args);
			break;
		case "g":
			ReverseString.main(args);
			break;
		case "h":
			twoSum.main(args);
			break;
		default:
			
		}
		
		
	}
		
}
