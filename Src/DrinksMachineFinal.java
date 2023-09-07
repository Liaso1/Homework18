import Helper.Drinks;
import Helper.DrinksMachine;
import Helper.Order;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrinksMachineFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();

        while (true) {
            DrinksMachine[] choices = DrinksMachine.values();

            System.out.println("Меню напоїв:");
            for (int i = 0; i < choices.length; i++) {
                System.out.println(i + ". " + choices[i] + " - " + Drinks.getPrice(choices[i]) + " $");
            }

            System.out.println("Виберіть напій та його кількість (або введіть " + choices.length + " для завершення):");
            int choiceIndex = scanner.nextInt();

            if (choiceIndex == choices.length) {
                break; // Виходить з циклу при виборі завершення
            }

            if (choiceIndex < 0 || choiceIndex >= choices.length) {
                System.out.println("Невірний вибір напою: " + choiceIndex);
                continue;
            }

            DrinksMachine selectedDrink = choices[choiceIndex];

            System.out.print("Введіть кількість для " + selectedDrink + ": ");
            int quantity = scanner.nextInt();

            order.addDrink(selectedDrink, quantity);
        }

        double totalBill = order.getTotalPrice();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Загальна сума до оплати: " + df.format(totalBill) + " $");

        scanner.close();
    }
}

