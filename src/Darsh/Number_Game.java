package Darsh;
import java.util.*;
public class Number_Game {
	public static void main(String[] args) {
			int attempt = 1;
			int userGuess = 0;
			int targetNumber = (int) (Math.random() * 100);
			Scanner userInput = new Scanner(System.in);
			System.out.println(
					"Welcome to Guess Number Game! \nGuess the number within 10 attempts to win the game.\n");
			do {
				System.out.print("Enter a guess number between 1 to 100: ");
				if (userInput.hasNextInt()) {
					userGuess = userInput.nextInt();
					if (userGuess == targetNumber) {
						System.out.println("Your Guess is Correct! You Won the Game in attempt "+attempt);
						break;
					} else if (userGuess < targetNumber)
						System.out.println("You entered a smaller number.");
					else if (userGuess > targetNumber)
						System.out.println("You entered a larger number.");
					if (attempt == 10) {
						System.out.println("You have exceeded the maximum attempts. Try Again!");
						break;
					}
					attempt++;
				} else {
					System.out.println("Enter a Valid Integer: ");
					break;
				}
			} while (userGuess != targetNumber);
		}
	}
