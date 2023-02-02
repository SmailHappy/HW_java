/**
* HW_lesson_3_task2
Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее ариф. из этого списка
*/

package HW_lesson3;

import java.util.ArrayList;
import java.util.Random;

public class HW_lesson_3_task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < random.nextInt(20) + 1; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);
        find(list);
    }
    
    public static void find(ArrayList<Integer> arlist) {
        Integer min = arlist.get(0);
        Integer max = arlist.get(0);
        Double averange = arlist.get(0).doubleValue();

        for (int i = 1; i < arlist.size(); i++) {
            if (arlist.get(i) > max) max = arlist.get(i);
            if (arlist.get(i) < min) min = arlist.get(i);
            averange += arlist.get(i).doubleValue();
        }
        
        averange = averange / arlist.size();

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avwrange = " + averange);
    }
}