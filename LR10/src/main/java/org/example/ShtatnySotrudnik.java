package org.example;

public class ShtatnySotrudnik extends Sotrudnik {
    private double premia;

    public ShtatnySotrudnik(String fio, String doljnost, double oklad, double premia)
            throws OkladException {
        super(fio, doljnost, oklad);
        this.premia = premia;
    }

    public double getPremia() { return premia; }
    public void setPremia(double premia) { this.premia = premia; }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (premia < 0) throw new PremiyaException(premia);
            return getOklad() + premia;
        } catch (PremiyaException e) {
            System.out.println(e.getMessage());
            return getOklad();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при расчёте зарплаты: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("ShtatnySotrudnik: блок finally выполнен");
        }
    }
}

