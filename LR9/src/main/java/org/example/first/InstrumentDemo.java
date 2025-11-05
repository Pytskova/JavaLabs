package org.example.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InstrumentDemo {
    public static void main(String[] args) {

        Map<String, MusicalInstrument> instruments = new HashMap<>();

        instruments.put("Акустическая гитара", new Guitar("Акустическая гитара", 6));
        instruments.put("Электрогитара", new Guitar("Электрогитара", 6));
        instruments.put("Пианино", new Piano("Пианино", false));
        instruments.put("Синтезатор", new Piano("Синтезатор", true));

        System.out.println("Список ключей (названия инструментов):");
        Set<String> keys = instruments.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("\nСодержимое отображения (ключ -> объект):");
        for (String key : keys) {
            MusicalInstrument value = instruments.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}
