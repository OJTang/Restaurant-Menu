package com.company.restaurant;
import java.util.*;

public class Menu {
    private ArrayList<String> menuItems;
    private String lastUpdated;

    public Menu(ArrayList<String> menuItems) {
        this.menuItems = menuItems;
    }
    
    ArrayList<String> getMenuItems() {
        return menuItems;
    }

    void setMenuItems(ArrayList<String> aMenuItems) {
        menuItems = aMenuItems;
    }

    String getLastUpdated() {
        return lastUpdated;
    }

    void setLastUpdated(String aLastUpdated) {
        lastUpdated = aLastUpdated;
    }


}
