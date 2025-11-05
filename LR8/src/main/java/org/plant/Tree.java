package org.plant;

public class Tree implements Plant {
    private final String name;
    private double heightCm;
    private int ageDays;
    private double trunkCm;

    public Tree(String name, double initialHeightCm, double initialTrunkCm) {
        this.name = name;
        this.heightCm = initialHeightCm;
        this.ageDays = 0;
        this.trunkCm = initialTrunkCm;
    }

    @Override public String getName() { return name; }
    @Override public double getHeightCm() { return heightCm; }
    @Override public int getAgeDays() { return ageDays; }

    @Override
    public void grow(int days) {
        if (days <= 0) return;
        double ratePerDay = ageDays < 365 * 3 ? 0.5 : 0.2;
        heightCm += ratePerDay * days;
        trunkCm  += 0.05 * (days / 30.0);
        ageDays  += days;
    }

    @Override
    public String toString() {
        return "Tree " + name + " - height= " + String.format("%.1f", heightCm) + " cm, age=" + ageDays + " d, trunk=" + String.format("%.1f cm", trunkCm);
    }
}