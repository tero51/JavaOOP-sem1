package org.example;

public class Product {
    private int cost;
    private String name;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }
    public int getCost() {
        this.cost = 100;
        return cost;
    }

//    public void setCost(int cost) {
//        this.cost = cost;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Product " +
                "cost = " + cost +
                ", name = '" + name + '\'';
    }
}
