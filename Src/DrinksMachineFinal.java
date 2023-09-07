import Helper.DrinksMachine;
import Helper.Order;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrinksMachineFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть напій:");
        for (DrinksMachine drink : DrinksMachine.values()) {
            System.out.println(drink.ordinal() + ". " + drink);
        }

        System.out.print("Ваш вибір: ");
        int choiceIndex = scanner.nextInt();

        if (choiceIndex < 0 || choiceIndex >= DrinksMachine.values().length) {
            System.out.println("Невірний вибір напою.");
            return;
        }

        DrinksMachine selectedDrink = DrinksMachine.values()[choiceIndex];

        System.out.print("Введіть кількість: ");
        int quantity = scanner.nextInt();

        Order order = new Order(selectedDrink, quantity);

        //Загуглив собі як позбутися зайвих чисел після нуля за допомогою DecimalFormat

        double totalBill = order.getTotalPrice();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Загальна сума до оплати: " + totalBill + " $");

        scanner.close();
    }
}

