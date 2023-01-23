/**
* HW_lesson1_task2
* Вывести все простые числа от 1 до 1000
*/

package HW_lesson1;

import java.util.ArrayList;
import java.util.List;

public class HW_lesson1_task2 {
    public static void main(String[] args) {
        System.out.println("Выводит все простые числа от 1 до 1000.");

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        int flag = 0;
        
        for (int i = 3; i < 1000; i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (i % numbers.get(j) == 0) {
                    flag = 0;
                    break;
                }
                else flag = 1;
            }
            if (flag == 1) numbers.add(i);
        }

        System.out.println(numbers);
    }
    
}