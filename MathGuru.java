import java.util.Scanner;

import static java.lang.System.exit;

public class MathGuru {


    public static void main(String[] args) {
//Calling Main Action function
        mainAction();

    }

    private static void mainAction() {
        Scanner scanner = new Scanner(System.in);
        int userSelection, userInput;
        String userChoice;
//Accepting user input

        System.out.println("Please select the operation\n");
        System.out.println("1. Power of two(2^n) where n is given by the user.\n");
        System.out.println("2. Factorial of n.\n");
        System.out.println("3. Fibonacci series till nth number\n ");
        userSelection = scanner.nextInt();
     //Validating user input
        if (userSelection > 3 || userSelection < 1) {
            System.out.println("\n invalid selection.please select the operation again\n");
            userSelection = scanner.nextInt();
            if (userSelection > 3 || userSelection < 1) {
                System.out.println("You have entered wrong choice again. Exiting the program");
                exit(0);
            }
        }

        System.out.println("\n Please enter value of n. 'n' should be less than 20 ");
        userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput >= 20) {
            System.out.println("You have entered a number greater than 20. So please re enter 'n' again\n");
            userInput = scanner.nextInt();
        }
      //Doing operations
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
        //Asking user to repeat the actions
        System.out.println("\n\n Do you want to try again?\n");
        userChoice = scanner.nextLine();
        switch (userChoice) {
            case "yes":
                mainAction();//calling the same function again.

                break;
            case "no":
                exit(0);//exiting the function
        }
    }


    private static void poweroftwocalculator(int userInput) {
    }

    private static void factorial(int userInput) {
    }

    private static void fibonacci(int userInput) {
    }

}
