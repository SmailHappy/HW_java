/**
* HW_lesson_3_task1
* Пусть дан произвольный список целых чисел, удалить из него четные числа
*/

package HW_lesson3;

import java.util.ArrayList;
import java.util.Random;

public class HW_lesson_3_task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < random.nextInt(20) + 1; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);
        System.out.println(find_and_del(list));
    }
    
    public static ArrayList<Integer> find_and_del(ArrayList<Integer> arlist) {
        for (int i = 0; i < arlist.size(); i++) {
            if (arlist.get(i) % 2 == 0) {
                arlist.remove(i);
                i--;
            }
        }
        return arlist;
    }
}