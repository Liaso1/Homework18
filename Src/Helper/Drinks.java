package Helper;

public class Drinks {
    private static final double COFFEE_PRICE = 3.55;
    private static final double TEA_PRICE = 1.95;
    private static final double LEMONADE_PRICE = 3.25;
    private static final double MOJITO_PRICE = 3.25;
    private static final double SODA_PRICE = 0.95;
    private static final double COKE_PRICE = 1.15;

    public static double getPrice(DrinksMachine choice) {
        switch (choice) {
            case COFFEE:
                return COFFEE_PRICE;
            case TEA:
                return TEA_PRICE;
            case LEMONADE:
                return LEMONADE_PRICE;
            case MOJITO:
                return MOJITO_PRICE;
            case SODA:
                return SODA_PRICE;
            case COKE:
                return COKE_PRICE;
            default:
                throw new IllegalArgumentException("Невідомий вибір напою: " + choice);
        }
    }
}
