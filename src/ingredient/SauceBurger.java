package ingredient;

public class SauceBurger extends Sauce {

    private final double weight;
    private static final double BASE_PRICE = 1;

    public SauceBurger(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}