import java.util.Scanner;
import java.util.Random;
public class GuessNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int NumberToGuess = num.nextInt(100)+1;
        int guess, attempts = 0;
        System.out.println("Guess the number between 1 and 100");
        while (true) {
            System.out.println("Enter Your Guess Number: ");
            guess = sc.nextInt();
            attempts++;
            if (guess == NumberToGuess) {
                System.out.println("Correct! you guess it in "+ attempts + "attempts");
                break;
            } else if(guess>NumberToGuess){
                 System.out.println("Too High!");
            } else{
                System.out.println("Too low!");
            }
            
        }
        sc.close();

    }
}