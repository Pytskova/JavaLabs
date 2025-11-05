package org.Plant;

public class Tree extends Plant {
    private double trunkCm;

    public Tree(String name, double initialHeightCm, double initialTrunkDiameterCm) {
        super(name, initialHeightCm);
        this.trunkCm = initialTrunkDiameterCm;
    }

    public double getTrunkDiameterCm() { return trunkCm; }

    @Override
    protected void doGrow(int days) {
        double ratePerDay = getAgeDays() < 365 * 3 ? 0.5 : 0.2;
        setHeightCm(getHeightCm() + ratePerDay * days);
        trunkCm += 0.05 * (days / 30.0);
    }

    @Override
    public String toString() {
        return "Tree " + super.toString() + ", trunk=" + String.format("%.1f cm", trunkCm);
    }
}
