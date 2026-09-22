package devops;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello DevOps");

    }
}package devops;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Too Low!");
            } else if (guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }

        } while (guess != number);

        scanner.close();
    }
}