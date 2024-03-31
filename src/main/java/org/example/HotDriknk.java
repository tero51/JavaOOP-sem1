package org.example;

public class HotDriknk extends BottleOfWater{
    int temp;

    public HotDriknk(int cost, String name, double volume, int temp) {
        super(cost, name, volume);
        this.temp = temp;
    }
    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "HotDriknk: " + "volume = " + super.getVolume() +
                ", cost = " + super.getCost() +
                ", name = '" + super.getName() + '\'' +
                ", temp = " + temp;
    }
}
