package Helper;

import Helper.Drinks;
import Helper.DrinksMachine;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<DrinksMachine, Integer> items = new HashMap<>();

    public void addDrink(DrinksMachine choice, int quantity) {
        items.put(choice, items.getOrDefault(choice, 0) + quantity);
    }

    public double getTotalPrice() {
        double total = 0.0;
        int totalQuantity = 0;

        for (Map.Entry<DrinksMachine, Integer> entry : items.entrySet()) {
            double drinkPrice = Drinks.getPrice(entry.getKey());
            int drinkQuantity = entry.getValue();
            total += drinkPrice * drinkQuantity;
            totalQuantity += drinkQuantity;
        }

        System.out.println("Напоїв замовлено " + totalQuantity + " шт, ціна - " + total + " $");
        return total;
    }
}
