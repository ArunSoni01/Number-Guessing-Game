import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" dd-MM-yyyy HH:mm:ss");
        String fDateTime  = dt.format(formatter);
        System.out.println("Current Date and Time : "+fDateTime);
        Guess guess = new Guess();
        guess.runGuess();
    }
}
