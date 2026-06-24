import java.util.Random;
import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min=1;
        int max=100;
        int randomNumber = random.nextInt(1, 100+1);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100: ");

        do {
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TO LOW! Try again");
            }
            else if(guess > randomNumber) {
                System.out.println("TO HIGH! Try again");
            }
            else{
                System.out.println("Correct the number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }


        }while (guess !=randomNumber);
        System.out.println("You have won");

        scanner.close();
    }
}
