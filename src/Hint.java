public class Hint {
    public String giveHint(int number, int guess) {
        if (guess > (number + 10) || guess < (number - 10)) {
            return "Cold";
        } else if (number == guess) {
            return "Right";
        } else {
            return "Hot";
        }
    }
    
}
