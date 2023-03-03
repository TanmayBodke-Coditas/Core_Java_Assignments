package Cafe_Allocation_System;

import java.util.*;

public class PrintMenu extends Thread {

    public void run() {
   /* int choice;
    String[] menu = {"Coffee :: 50rs.", "Sandwich :: 100rs.", "Pizza :: 150rs."};

    {
        for(int i =1; i<=menu.length; i++){
            System.out.println(i+". "+ menu[i-1]);
        }


        Scanner input = new Scanner(System.in);
        ArrayList<String> selectedItems = new ArrayList<String>();
        ArrayList<Integer> quantities = new ArrayList<Integer>();


        while (choice != -1) {
            System.out.print("Please select an item from the menu (-1 to stop): ");
            choice = input.nextInt();

            if (choice != -1) {
                System.out.print("Enter the quantity: ");
                int quantity = input.nextInt();

                selectedItems.add(menu[choice - 1]);
                quantities.add(quantity);
            }
        }

        System.out.println("You have selected the following items:");
        for (int i = 0; i < selectedItems.size(); i++) {
            String item = selectedItems.get(i);
            int quantity = quantities.get(i);
            System.out.println((i+1)  +" "+ item + " x " + quantity);
        }
    }*/

        HashMap<String, Double> menu = new HashMap<String, Double>();
        menu.put("Pizza", 10.99);
        menu.put("Burger", 5.99);
        menu.put("Coffee", 7.99);

        System.out.println("------MENU-------");
        System.out.println();
        for (String item : menu.keySet()) {
            System.out.println(item + " - " + menu.get(item));
        }
        System.out.println("----------------");



    }
}



