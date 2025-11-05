package org.plant;

public class Flower implements Plant {
    private final String name;
    private double heightCm;
    private int ageDays;
    private int bloom;

    public Flower(String name, double initialHeightCm) {
        this.name = name;
        this.heightCm = initialHeightCm;
        this.ageDays = 0;
        this.bloom = 0;
    }

    @Override public String getName() { return name; }
    @Override public double getHeightCm() { return heightCm; }
    @Override public int getAgeDays() { return ageDays; }

    @Override
    public void grow(int days) {
        if (days <= 0) return;
        heightCm = Math.min(60.0, heightCm + 0.8 * days);
        int before = ageDays / 30;
        int after  = (ageDays + days) / 30;
        bloom += Math.max(0, after - before);
        ageDays += days;
    }

    @Override
    public String toString() {
        return "Flower " + name + " - height= " + String.format("%.1f", heightCm) + " cm, age=" + ageDays + " d, blooms=" + bloom;
    }
}