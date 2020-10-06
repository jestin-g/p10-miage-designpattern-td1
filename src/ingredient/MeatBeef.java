package ingredient;

public class MeatBeef extends Meat {

    private final double weight;
    private static final double BASE_PRICE;

    static {
        BASE_PRICE = 4;
    }

    public MeatBeef(double weight) {
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