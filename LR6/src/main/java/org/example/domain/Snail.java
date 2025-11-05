package org.example.domain;

public class Snail {
    private String name;
    protected double speed;
    public String color;
    private boolean inShell;


    public Snail(String name, double speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public String getInfo() {
        String status = inShell ? " (в раковине)" : "";
        return "Имя: " + name + "\nЦвет: " + color + "\nСкорость: " + speed + " см/сек" + status;
    }

    public String crawl(double distance) {
        inShell = false;
        return name + " проползла " + distance + " см.";
    }

    public String rest() {
        hideInShell();
        return name + " отдыхает в раковине...";
    }

    private void hideInShell() {
        speed = 0;
        inShell = true;
    }


}
