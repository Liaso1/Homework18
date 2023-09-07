package Helper;

import Helper.Drinks;
import Helper.DrinksMachine;

public class Order {
    private DrinksMachine choice;
    private int quantity;

    public Order(DrinksMachine choice, int quantity) {
        this.choice = choice;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return Drinks.getPrice(choice) * quantity;
    }
}
