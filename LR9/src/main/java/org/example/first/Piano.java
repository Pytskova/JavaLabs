package org.example.first;

public class Piano extends MusicalInstrument {

    private final boolean isElectric;

    public Piano(String name, boolean isElectric) {
        super(name, "Клавишный инструмент");
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }
}
