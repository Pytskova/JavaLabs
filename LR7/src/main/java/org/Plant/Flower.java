package org.Plant;

public class Flower extends Plant {
    private int bloom;

    public Flower(String name, double initialHeightCm) { super(name, initialHeightCm); }
    public int getBloom() { return bloom; }

    @Override
    protected void doGrow(int days) {
        setHeightCm(Math.min(60.0, getHeightCm() + 0.8 * days));
        int before = getAgeDays() / 30;
        int after  = (getAgeDays() + days) / 30;
        bloom += Math.max(0, after - before);
    }
    public void print(){
        System.out.println(bloom);
    }

    @Override
    public String toString() {
        return "Flower " + super.toString() + ", blooms=" + bloom;
    }
}
