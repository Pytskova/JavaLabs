package org.example.first;

public class Guitar extends MusicalInstrument {

    private final int stringsCount;

    public Guitar(String name, int stringsCount) {

        super(name, "Струнный инструмент");
        this.stringsCount = stringsCount;
    }

    public int getStringsCount() {
        return stringsCount;
    }
}
