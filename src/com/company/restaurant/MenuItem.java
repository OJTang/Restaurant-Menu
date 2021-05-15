package com.company.restaurant;
import java.util.*;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem (double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double aPrice) {
        price = aPrice;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String aDescription) {
        description = aDescription;
    }

    String getCategory() {
        return category;
    }

    void setCategory(String aCategory) {
        category = aCategory;
    }

    boolean getIsNew() {
        return isNew;
    }

    void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }
}
