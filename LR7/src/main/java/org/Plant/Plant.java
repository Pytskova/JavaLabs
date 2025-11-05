package org.Plant;

public abstract class Plant {
    private final String name;
    private double heightCm;
    private int ageDays;

    protected Plant(String name, double initialHeightCm) {
        this.name = name;
        this.heightCm = initialHeightCm;
        this.ageDays = 0;
    }

    public String getName() { return name; }
    public double getHeightCm() { return heightCm; }
    public int getAgeDays() { return ageDays; }

    protected void setHeightCm(double newHeight) {
        this.heightCm = newHeight;
    }
    protected void addAgeDays(int days) {
        this.ageDays += days;
    }

    public final void grow(int days) {
        doGrow(days);
        addAgeDays(days);
    }

    protected abstract void doGrow(int days);

    @Override
    public String toString() {
        return name + " - height= "+ heightCm +" cm, age=" + ageDays + " d";
    }
}
