package org.example;

public class KontraktnySotrudnik extends Sotrudnik {
    public KontraktnySotrudnik(String fio, String doljnost, double oklad) throws OkladException {
        super(fio, doljnost, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчёте зарплаты: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("KontraktnySotrudnik: расчёт завершён (finally).");
        }
    }
}
