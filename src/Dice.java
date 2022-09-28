import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int sides) {
        this.sides = sides;
    }

    public void roll() {
        Random rand = new Random();
        sideFacingUp = rand.nextInt(sides-1)+1;
    }
    public int view() {
        return sideFacingUp;
    }
}
