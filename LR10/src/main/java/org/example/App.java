package org.example;

public class App {
    public static void main(String[] args) {
        Firma firma = new Firma("ООО «ПримерФирма»");
        Otdel it = new Otdel("ИТ-отдел", 2);

        System.out.println("Фирма: " + firma.getName());
        System.out.println("Отдел: " + it.getName() + ", сотрудников: " + it.getEmployeesCount());
        System.out.println("--------------------------------------------");

        System.out.println("оклад");

        try {
            Sotrudnik bad = new Sotrudnik("Сидоров С.С.", "программист", -1000);
            System.out.println(bad);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
            try {
                Sotrudnik g = new Sotrudnik("Сидоров С.С.", "программист", 1000);
                System.out.println("Повторное создание успешно: " + g);
            } catch (OkladException ex2) {
                System.out.println("Ошибка повторного создания: " + ex2.getMessage());
            }
        }
        System.out.println("--------------------------------------------");

        System.out.println("Премия");

        try {
            ShtatnySotrudnik shtat = new ShtatnySotrudnik("Иванов И.И.", "менеджер", 1200, -300);
            double zp = shtat.rasschitatZarplatu(); // внутри сработает и обработается
            System.out.println("Итоговая зарплата (штатный, с отрицательной премией): " + zp);
        } catch (OkladException e) {
            System.out.println("Ошибка создания штатного сотрудника: " + e.getMessage());
        }
        System.out.println("--------------------------------------------");

        System.out.println("расчет зп");

        try {
            KontraktnySotrudnik kont = new KontraktnySotrudnik("Петров П.П.", "аналитик", 1500);
            double zp = kont.rasschitatZarplatu();
            System.out.println("Итоговая зарплата (контрактный): " + zp);
        } catch (OkladException e) {
            System.out.println("Ошибка создания контрактного сотрудника: " + e.getMessage());
        }

    }
}
