@@ -0,0 +1,42 @@
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        int guess;

        System.out.println("================================");
        System.out.println("          NUMBER GAME");
        System.out.println("================================");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess the number!");

        do {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();

            if (guess < number) {
                System.out.println("Too Low! Try again.");
            } 
            else if (guess > number) {
                System.out.println("Too High! Try again.");
            } 
            else {
                System.out.println("\n🎉 Congratulations!");
                System.out.println("You guessed the correct number!");
                System.out.println("The number was: " + number);
            }

        } while (guess != number);

        sc.close();
    }
}