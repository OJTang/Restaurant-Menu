package com.company.restaurant;
import java.util.*;

public class Menu {
    @Override
    public String toString() {
        return "{" +
                "menuItems=" + menuItems +
                '}';
    }

    private ArrayList<Object> menuItems = new ArrayList<>();
    private Date lastUpdated;


    ArrayList<Object> getMenuItems() {
        return menuItems;
    }

    void setMenuItems(ArrayList<Object> aMenuItems) {
        menuItems = aMenuItems;
    }

    Date getLastUpdated() {
        return lastUpdated;
    }

    void setLastUpdated(Date aLastUpdated) {
        lastUpdated = aLastUpdated;
    }


    void addMenuItem (Object menuItem) {
        if (!menuItems.contains(menuItem)) {
            this.menuItems.add(menuItem);
            this.lastUpdated = new Date();
        } else {
            System.out.println("This item is already on the menu.");
        }
    }

    void removeMenuItem (Object menuItem) {
        menuItems.remove(menuItem);
    }

    void print () {
            for (Object menuItem : menuItems) {
                System.out.println(menuItem + "\n");
            }
    }

}
