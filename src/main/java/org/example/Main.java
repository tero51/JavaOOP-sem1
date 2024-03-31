package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater(50, "Baikalskaya", 1));
        productList.add(new BottleOfWater(45, "Jigulievskaya", 1));
        productList.add(new BottleOfWater(100, "Baikalskaya", 2));
        productList.add(new BottleOfWater(100, "termal", 1));
        productList.add(new BottleOfWater(200, "termal", 2));
        productList.add(new BottleOfWater(150, "Aeon", 1));
        productList.add(new HotDriknk(750, "Morgan", 1, 30 ));
        productList.add(new HotDriknk(250, "cappucino", 0.33, 65 ));
        WaterVendingMachine vendingMachine = new WaterVendingMachine();
        vendingMachine.initProduct(productList);
        HotDrinkMachine hotVendingMachine = new HotDrinkMachine();
        hotVendingMachine.initProduct(productList);

        System.out.println(vendingMachine.getProduct("Baikalskaya", 2));
        System.out.println(vendingMachine.getProduct("Baikalskaya"));
        System.out.println(hotVendingMachine.getProduct("Morgan"));
        System.out.println(hotVendingMachine.getProduct("cappucino", 0.33, 65));
    }
}
