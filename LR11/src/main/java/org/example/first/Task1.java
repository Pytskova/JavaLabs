package org.example.first;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("about_me.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Имя: Ольга\n");
            writer.write("Учебное заведение: Колледж бизнеса и права\n");
            writer.write("Специальность: Разработка и сопровождение ПО\n");
            writer.write("Хобби: Спать и отдыхать\n");
            writer.close();

            System.out.println("\nИнформация о файле:");
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Можно читать: " + file.canRead());
            System.out.println("Можно записывать: " + file.canWrite());
            System.out.println("Файл существует: " + file.exists());

            System.out.println("\nСодержимое файла:");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}