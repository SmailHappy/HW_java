/*
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности Имени.
*/

package HW_lesson5;

import java.util.HashMap;

public class HW_lesson_5_task_2 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();
        hmap = fill_hmap(hmap);

        HashMap<String, String> sort = new HashMap<>();
        Integer count = 0;
        for (var temp : hmap.entrySet()) {
            String item = temp.getValue();
            if (!sort.containsKey(item)) {
                for (var el : hmap.entrySet()) {
                    if (el.getValue().equals(item)) {
                        count ++;
                    }
                }
                sort.put(item, Integer.toString(count));
                count = 0;
            }
        }
        System.out.println(sort);

        while (!sort.isEmpty()) {
            for (var temp : sort.entrySet()) {
                Integer max = Integer.parseInt(temp.getValue());
                String key = temp.getKey();
                for (var item : sort.entrySet()) {
                    if (Integer.parseInt(item.getValue()) > max) {
                        max = Integer.parseInt(item.getValue());
                        key = item.getKey();
                    }
                }
                sort.remove(key);
                System.out.println(key + " repeated " + max);
                break;
            }
        }
    }

    public static HashMap<String, String> fill_hmap(HashMap<String, String> hmap) {
        /*
        Пусть дан список сотрудников:
            Иван Иванов, Светлана Петрова, Кристина Белова
            Анна Мусина, Анна Крутова, Иван Юрин
            Петр Лыков, Павел Чернов, Петр Чернышов
            Мария Федорова, Марина Светлова, Мария Савина
            Мария Рыкова, Марина Лугова, Анна Владимирова
            Иван Мечников, Петр Петин, Иван Ежов
        */
        hmap.put("Иванов", "Иван"); hmap.put("Петрова", "Светлана"); hmap.put("Белова", "Кристина");
        hmap.put("Мусина", "Анна"); hmap.put("Крутова", "Анна"); hmap.put("Юрин", "Иван");
        hmap.put("Лыков", "Петр"); hmap.put("Чернов", "Павел"); hmap.put("Чернышов", "Петр");
        hmap.put("Федорова", "Мария"); hmap.put("Светлова", "Марина"); hmap.put("Савина", "Мария");
        hmap.put("Рыкова", "Мария"); hmap.put("Лугова", "Марина"); hmap.put("Владимирова", "Анна");
        hmap.put("Мечников", "Иван"); hmap.put("Петин", "Петр"); hmap.put("Ежов", "Иван");

        return hmap;
    }
}
