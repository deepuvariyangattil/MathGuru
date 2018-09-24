import java.util.Scanner;

public class MathGuru {
    public static void main(String[] args) {
		//Request for user info
        Scanner scanner = new Scanner(System.in);
        int userSelection, userInput;
        System.out.println("Please select the operation\n");
        System.out.println("1. Power of two(2^n) where n is given by the user.\n");
        System.out.println("2. Factorial of n.\n");
        System.out.println("3. Fibonacci series till nth number\n ");
        userSelection = scanner.nextInt();
        System.out.println("\n Please enter value of n");
        userInput = scanner.nextInt();
        switch (userSelection) {
            case 1:
                poweroftwocalculator(userInput);
                break;
            case 2:
                factorial(userInput);
                break;
            case 3:
                fibonacci(userInput);
                break;
            default:
                System.out.println("You have made a wrong selection");
                break;
        }
    }

    private static void poweroftwocalculator(int userInput) {
    }

    private static void factorial(int userInput) {
    }

    private static void fibonacci(int userInput) {
    }

}
