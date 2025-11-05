package org.example.Third;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task3 {
    private static final String FILE_NAME = "dates.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("03.11.2025\n");
            writer.write("12.05.2023\n");
            writer.write("29.02.2024\n");   // високосный год — корректно
            writer.write("32.01.2022\n");   // неверная дата
            writer.write("15.13.2025\n");   // неверный месяц
            writer.write("10-10-2020\n");   // неверный формат
            writer.write("05.09.2021\n");
            System.out.println("Файл с датами создан: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
            return;
        }

        // 2. Проверка корректности формата дат
        System.out.println("\nПроверка дат:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                try {
                    format.parse(line); // пытаемся разобрать дату
                    System.out.println(line + " — корректная дата ");
                } catch (ParseException e) {
                    System.out.println(line + " — неверный формат  (" + e.getMessage() + ")");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}