package Cafe_Allocation_System;

import java.util.*;

public class SelectMenu extends Thread {

    public void run() {
        HashMap<Integer, String> menu = new HashMap<Integer, String>();
        menu.put(1, "Pizza");
        menu.put(2, "Burger");
        menu.put(3, "Coffee");

        HashMap<String, Double> prices = new HashMap<String, Double>();
        prices.put("Pizza", 10.99);
        prices.put("Burger", 5.99);
        prices.put("Coffee", 7.99);

        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> selectedItems = new HashMap<String, Integer>();
        int choice = 0;

        while (choice != -1) {
            System.out.print("Please select an item from the menu (type -1 to stop): ");
            choice = input.nextInt();

            if (menu.containsKey(choice)) {
                String item = menu.get(choice);
                System.out.print("Enter the quantity: ");
                int quantity = input.nextInt();
                input.nextLine();

                if (selectedItems.containsKey(item)) {
                    selectedItems.put(item, selectedItems.get(item) + quantity);
                } else {
                    selectedItems.put(item, quantity);
                }
            } else if (choice != -1) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        if (!selectedItems.containsKey("Coffee")) {
            try {
                throw new InvalidOrderException();
            } catch (InvalidOrderException e) {
                System.out.println();
            }
        }

        HashMap<String, Double> selectedSubtotals = new HashMap<String, Double>();
        for (String item : selectedItems.keySet()) {
            int quantity = selectedItems.get(item);
            double price = prices.get(item);
            double subtotal = quantity * price;
            selectedSubtotals.put(item, subtotal);
        }

        Comparator<Map.Entry<String, Double>> comparator = new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        };
        Map<String, Double> sortedSelectedSubtotals = new LinkedHashMap<String, Double>();
        selectedSubtotals.entrySet().stream()
                .sorted(comparator)
                .forEachOrdered(entry -> sortedSelectedSubtotals.put(entry.getKey(), entry.getValue()));

        System.out.println();
        System.out.println("--------------BILL OF YOUR ORDER--------------");
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Bill No :: " + randomNumber);
        double total = 0;
        System.out.println("You have selected the following items:");
        for (String item : sortedSelectedSubtotals.keySet()) {
            int quantity = selectedItems.get(item);
            double price = prices.get(item);
            double subtotal = sortedSelectedSubtotals.get(item);
            System.out.println(item + " x " + quantity + " - " + subtotal);
            total += subtotal;
        }
        System.out.println("Total: " + total);






    }
}
