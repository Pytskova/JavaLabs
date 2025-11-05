package org.plant;

public interface Plant {
    String getName();
    double getHeightCm();
    int getAgeDays();
    void grow(int days);
}