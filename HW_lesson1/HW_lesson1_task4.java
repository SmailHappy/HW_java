/**
* HW_lesson1_task4
* Дополнительно*
* Задано уравнение вида x + y = z. И (x, y, z) >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
Вывод 24 + 45 = 69
*/

package HW_lesson1;

import java.util.Scanner;

public class HW_lesson1_task4 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Восстанавливает выражение до верного равенства. При условие что ? - одно число"
                        + "\nВведите уравнение вида x + y = z, где x, y, z >= 0, например 2? + ?5 = 69.");

        String equation = user_input.nextLine();
        user_input.close();

        String[] equation_array = equation.split(" ");
        // String operant = equation_array[1];
        String number_one = equation_array[0];
        String number_two = equation_array[2];
        Integer result = Integer.parseInt(equation_array[4]);
        int flag = 0;

        for (int i = 0; i < 10; i++) {
            Integer numb_1 = Integer.parseInt(number_one.replace("?", Integer.toString(i)));
            Integer numb_2 = Integer.parseInt(number_two.replace("?", Integer.toString(i)));

            if (numb_1 + numb_2 == result) {
                flag = 1;
                equation_array[0] = number_one.replace("?", Integer.toString(i));
                equation_array[2] = number_two.replace("?", Integer.toString(i));
                System.out.println("Решение - число " + i);
                break;
            }
        }

        if (flag == 0) System.out.println("При данном условии решения для этого уравнения нету.");
        else System.out.println(String.join(" ", equation_array));
    }
    
}