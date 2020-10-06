package ingredient;

public class MeatWhitefish extends Meat {

    private final double weight;
    private static final double BASE_PRICE;

    static {
        BASE_PRICE = 6;
    }

    public MeatWhitefish(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}