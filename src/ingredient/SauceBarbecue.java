package ingredient;

public class SauceBarbecue extends Sauce {

    private final double weight;
    private static final double BASE_PRICE = 1;

    public SauceBarbecue(double weight) {
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