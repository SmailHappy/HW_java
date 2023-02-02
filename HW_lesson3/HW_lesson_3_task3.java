/**
* HW_lesson_3_task3
(Дополнительное) Реализовать алгоритм сортировки слиянием (Дополнительное)
*/

package HW_lesson3;

import java.util.ArrayList;
import java.util.Random;

public class HW_lesson_3_task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arlist = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < random.nextInt(20) + 1; i++) {
            arlist.add(random.nextInt(100));
        }

        System.out.println(arlist);

        ArrayList<Integer> result_arlist = new ArrayList<>();
        result_arlist = sort_s(arlist, result_arlist);

        System.out.println(result_arlist);
    }
    
    public static ArrayList<Integer> sort_s(ArrayList<Integer> arlist, ArrayList<Integer> result) {
        ArrayList<Integer> arlist_one = new ArrayList<>();
        ArrayList<Integer> arlist_two = new ArrayList<>();
        // Заполнение массивов
        if (arlist.size() > 2 ) {
            if (arlist.size() % 2 == 0) {
                for (int i = 0; i < arlist.size() / 2; i++) {
                    arlist_one.add(arlist.get(i));
                    arlist_two.add(arlist.get(arlist.size() - 1 - i));
                }
            } else {
                for (int i = 0; i < (arlist.size() - 1) / 2; i++) {
                    arlist_one.add(arlist.get(i));
                    arlist_two.add(arlist.get(arlist.size() - 1 - i));
                }
                arlist_one.add(arlist.get((arlist.size() - 1) / 2));
            }
            System.out.println(arlist_one + "---" + arlist_two);
            result = sort_s(arlist_one, result);
            result = sort_s(arlist_two, result);
        } else if (arlist.size() == 2) { 
            arlist_one.add(arlist.get(0));
            arlist_two.add(arlist.get(1));
            System.out.println(arlist_one + "---" + arlist_two);
            result = sort_s(arlist_one, result);
            result = sort_s(arlist_two, result);
        } else {
            if (result.size() < 1) {
                result.add(arlist.get(0));
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (arlist.get(0) < result.get(i)) {
                        result.add(i, arlist.get(0));
                        System.out.println(result);
                        return result;
                    }
                }
                result.add(arlist.get(0));
            }
        }
        return result;
    }
}