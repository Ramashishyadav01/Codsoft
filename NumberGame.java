import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            int numToGuess = r.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean correctGuess = false;

            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !correctGuess) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    totalScore += (maxAttempts - attempts + 1); 
                    correctGuess = true;
                } else if (userGuess < numToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numToGuess);
            }

            System.out.println("Game over! Your total score is: " + totalScore);
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
            
        }

           sc.close();
    }
}
