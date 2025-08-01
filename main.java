import java.util.Scanner;

public class main { // Changed class name from 'RNG' to 'main'
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        int myNumber = (int)(Math.random() * 100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        do {
            System.out.println("Guess my number(1-100):");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Wohoo! Correct Number!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }

        } while (userNumber != myNumber);

        System.out.print("My number was: ");50
        
        System.out.println(myNumber);

        sc.close();
    }
}  