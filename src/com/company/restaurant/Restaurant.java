package com.company.restaurant;
import java.util.*;

public class Restaurant {
    public static void main (String[] args) {

        MenuItem bread = new MenuItem("Bread", 4.99, "It's bread, what do you want?", "Grains");

        MenuItem cheese = new MenuItem("Cheese", 2.49, "It's cheese.", "Dairy");

        MenuItem eggs = new MenuItem("Eggs", 3.89, "Over-easy.", "Protein");

        MenuItem steak = new MenuItem("Steak", 23.99, "Ribeye", "Protein");

        Menu menu = new Menu();

        menu.addMenuItem(bread);

        menu.addMenuItem(cheese);

        menu.addMenuItem(eggs);

        menu.addMenuItem(steak);

        menu.addMenuItem(steak);

        menu.addMenuItem(bread);

        bread.setIsNew(true);

        menu.print();

        System.out.println(menu.getLastUpdated());

        cheese.print();

        menu.removeMenuItem(bread);

        menu.print();
    }
}
