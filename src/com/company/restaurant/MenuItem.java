package com.company.restaurant;
import java.util.*;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem (String name, double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "{" +
                name + ": " +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    void print () {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) && description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
