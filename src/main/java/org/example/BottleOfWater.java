package org.example;

public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(int cost, String name, double volume) {
        super(cost, name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater: " +
                "volume = " + volume + ", cost = " + super.getCost() +
                ", name = '" + super.getName() + '\'';
    }
}
