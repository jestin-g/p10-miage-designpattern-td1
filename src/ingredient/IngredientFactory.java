package ingredient;

public class IngredientFactory {

    public Ingredient getIngredient(String type, double weight) {
        if ("Tomato".equalsIgnoreCase(type)) {
            return new Tomato(weight);
        } else if ("Cheddar".equalsIgnoreCase(type)) {
            return new Cheddar(weight);
        } else if ("DeepFriedOnion".equalsIgnoreCase(type)) {
            return new DeepFriedOnions(weight);
        } else if ("Beef".equalsIgnoreCase(type)) {
            return new MeatBeef(weight);
        } else if ("Whitefish".equalsIgnoreCase(type)) {
            return new MeatWhitefish(weight);
        } else {
            return null;
        }
    }

}
