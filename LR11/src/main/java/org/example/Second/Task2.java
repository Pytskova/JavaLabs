package org.example.Second;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    private static final int N = 15;
    private static final String FILE_NAME = "temperatures.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);

        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(new FileWriter(file))) {

            System.out.println("Введите " + N + " значений температуры (вещественные). Можно с точкой или запятой:");
            int i = 0;
            while (i < N) {
                System.out.print((i + 1) + ": ");
                String token = in.next().trim();

                token = token.replace(',', '.');

                try {
                    double value = Double.parseDouble(token);
                    out.print(value);
                    if (i < N - 1) out.print(' ');
                    i++;
                } catch (NumberFormatException e) {
                    System.out.println("Это не число. Попробуйте ещё раз.");
                }
            }
            out.flush();
            System.out.println("Данные записаны в файл: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        double sum = 0.0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                String tok = fileScanner.next().replace(',', '.');
                try {
                    double v = Double.parseDouble(tok);
                    sum += v;
                    count++;
                } catch (NumberFormatException ignored) {
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (count == 0) {
            System.out.println("Во входном файле нет корректных чисел.");
        } else {
            double avg = sum / count;
            System.out.printf(Locale.US, "Прочитано чисел: %d%nСредняя температура: %.3f%n", count, avg);
            if (count != N) {
                System.out.println("Внимание: количество значений в файле отличается от " + N + ".");
            }
        }
    }
}
