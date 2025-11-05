package org.example;

public class Sotrudnik {
    private String fio;
    private String doljnost;
    private double oklad;

    public Sotrudnik(String fio, String doljnost, double oklad) throws OkladException {
        setFio(fio);
        setDoljnost(doljnost);
        if (oklad < 0) {
            throw new OkladException(oklad);
        }
        this.oklad = oklad;
    }

    public String getFio() { return fio; }

    public void setFio(String fio) {
        if (fio == null || fio.isBlank()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        this.fio = fio.trim();
    }

    public String getDoljnost() { return doljnost; }

    public void setDoljnost(String doljnost) {
        if (doljnost == null || doljnost.isBlank()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        this.doljnost = doljnost.trim();
    }

    public double getOklad() { return oklad; }

    public void setOklad(double oklad) {
        if (oklad < 0) {
            throw new IllegalArgumentException("Оклад не может быть отрицательным (используйте конструктор для проверки через OkladException)");
        }
        this.oklad = oklad;
    }

    public double rasschitatZarplatu() {
        return oklad;
    }

    @Override
    public String toString() {
        return fio + " (" + doljnost + "), оклад = " + oklad;
    }
}
