package com.javaspring.basicwebshop.controllers;

import com.javaspring.basicwebshop.models.ShopItem;
import com.javaspring.basicwebshop.models.ShopItemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {

    ShopItemStore shopItemStore;

    public ShopController() {
        shopItemStore = new ShopItemStore();
        shopItemStore.addItem(new ShopItem("Zebra horse", "Looks like zebra but it's a horse", 4, 5));
        shopItemStore.addItem(new ShopItem("Unicorn", "Can poop rainbow", 8, 0));
        shopItemStore.addItem(new ShopItem("Dragon", "Can burn King's Landing", 6, 1));
        shopItemStore.addItem(new ShopItem("Platypus", "Weird, but nice, but weird", 12, 2));
        shopItemStore.addItem(new ShopItem("Magical nike shoes", "Do nothing special", 1, 4));
    }


    @RequestMapping("/webshop")
    public String webshop(Model model) {
        model.addAttribute("ShopItemStore", shopItemStore.getItemList());
        return "WebShop";
    }

    @RequestMapping("/only-available")
    public String available(Model model) {
        model.addAttribute("ShopItemStore", shopItemStore.sortAvailable());
        return "WebShop";
    }

    @RequestMapping("/cheapest-first")
    public String cheapest(Model model) {
        model.addAttribute("ShopItemStore", shopItemStore.sortCheapFirst());
        return "WebShop";
    }

    @RequestMapping("/contains-nike")
    public String nike(Model model) {
        model.addAttribute("ShopItemStore", shopItemStore.containsNike());
        return "WebShop";
    }

    @RequestMapping("/average-stock")
    public String average(Model model) {
        model.addAttribute("Average", shopItemStore.averageStock());
        return "WebShopAverageStock";
    }

    @RequestMapping("/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("Average", shopItemStore.mostExpensive());
        return "WebShopAverageStock";
    }

    @RequestMapping("/search")
    public String search(Model model, @RequestParam("search") String search) {
        model.addAttribute("ShopItemStore", shopItemStore.search(search.toLowerCase()));
        return "WebShop";
    }

}
