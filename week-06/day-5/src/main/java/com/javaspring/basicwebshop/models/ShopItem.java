package com.javaspring.basicwebshop.models;

public class ShopItem implements Comparable<ShopItem> {
    String name;
    String description;
    int price;
    int quantityOfStock;

    public ShopItem(String name, String description, int price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    @Override
    public int compareTo(ShopItem otherItem) {
        if(this.price < otherItem.price) {
            return -1;
        } else if (this.price > otherItem.price) {
            return 1;
        }
        return 0;
    }

}
