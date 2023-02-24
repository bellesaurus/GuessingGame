import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) throws Exception {
        
        int secretNum;
        int guess;
        boolean correct = false;
        Random rand = new Random();
        int tries = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Guess my secret number!");
        System.out.println("THe number is between 0 and 100 and you only have 5 tries!");
        secretNum = rand.nextInt(100);  //sets secret number to user input

        while(!correct && tries<5){
            System.out.println("Your guess: ");
            guess = keyboard.nextInt();
            tries++;

            if(guess == secretNum){
                correct = true;
                System.out.println("You guessed the secret number!");
            } else if(guess < secretNum){
                System.out.println("A little higher!");
            } else if(guess > secretNum){
                System.out.println("Get low, get low!");
            }
        }
        System.out.println("Uh oh, you've  reached the limit. Try again next time.");
    }
}
