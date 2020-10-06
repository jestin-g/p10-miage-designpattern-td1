package ingredient;

public class DeepFriedOnions implements Ingredient {

    private final double weight;
    private static final double BASE_PRICE;

    static {
        BASE_PRICE = 1.5;
    }


    public DeepFriedOnions(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
