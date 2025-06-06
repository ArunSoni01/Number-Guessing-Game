import java.util.Random;

public class RandomNumber {
    private int number;

    public RandomNumber() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1; // 1 to 100
    }

    public int getRandomNumber() {
        return this.number;
    }
}
