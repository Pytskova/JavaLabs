package org.example;

public class Firma {
    private String name;

    public Firma(String name) {
        setName(name);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название фирмы не может быть пустым");
        }
        this.name = name.trim();
    }
}
