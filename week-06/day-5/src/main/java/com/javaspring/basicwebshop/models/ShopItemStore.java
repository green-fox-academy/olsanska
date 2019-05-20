package com.javaspring.basicwebshop.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItemStore {

    private List<ShopItem> itemList;

    public ShopItemStore() {
        this.itemList = new ArrayList<>();

    }

    public void addItem(ShopItem item) {
        itemList.add(item);
    }

    public List<ShopItem> getItemList() {
        return itemList;
    }

    public List<ShopItem> sortAvailable() {
        return itemList.stream()
                .filter(item -> item.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortCheapFirst() {
        return itemList.stream()
                .sorted(ShopItem::compareTo)
                .collect(Collectors.toList());
    }

    public List<ShopItem> containsNike() {
        return itemList.stream()
                .filter(item -> item.name.toLowerCase().contains("nike") || item.description.toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public double averageStock() {
        return itemList.stream()
                .mapToDouble(item -> item.getQuantityOfStock())
                .average().getAsDouble();
    }

    public String mostExpensive() {
        return itemList.stream()
                .sorted(ShopItem::compareTo)
                .collect(Collectors.toList()).get(itemList.size() - 1).getName();
    }

    public List<ShopItem> search(String string) {
        return itemList.stream()
                .filter(item -> item.name.toLowerCase().contains(string) || item.description.toLowerCase().contains(string))
                .collect(Collectors.toList());
    }
}

