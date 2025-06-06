import java.util.Scanner;

public class Guess {
    // Update the Method to run the guessing game
    public void runGuess() {
        RandomNumber rm = new RandomNumber();
        int secretNumber = rm.getRandomNumber();
        int userGuess;
        String hint;

        Scanner scanner = new Scanner(System.in);
        Hint h = new Hint();
        
        while(true){
            System.out.print("Enter a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            hint = h.giveHint(secretNumber, userGuess);
            if (hint.equals("Right")) {
                System.out.println("You guessed it Right!");
                break;
            } else {
                System.out.println(hint);
            }
        }
        

        scanner.close();
    }
}
