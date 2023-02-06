/**
* HW_lesson_4_task1
* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод(не void), который вернет “перевернутый” список.
*/

package HW_lesson4;

import java.util.LinkedList;
import java.util.Random;

public class HW_lesson_4_task1 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linlist = new LinkedList<>();

        for (int i = 0; i < random.nextInt(20) + 1; i++) {
            linlist.add(0, random.nextInt(100));
        }

        System.out.println(linlist);

        linlist = reverse(linlist);

        System.out.println(linlist);
    }
    
    public static LinkedList<Integer> reverse(LinkedList<Integer> linlist) {
        LinkedList<Integer> linlist2 = new LinkedList<>();

        for (int i = 0; i < linlist.size(); i++) {
            linlist2.add(i, linlist.get(linlist.size() - 1 - i));
        }

        return linlist2;
    }
}