import java.util.Random;

public class RamdomNumber {
    public int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
