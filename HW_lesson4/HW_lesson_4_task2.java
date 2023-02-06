/**
* HW_lesson_4_task2
* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/

package HW_lesson4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HW_lesson_4_task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linlist = new LinkedList<>();
        Random random = new Random();
        
        for (int i = 0; i < random.nextInt(20) + 1; i++) {
            linlist.add(0, random.nextInt(100));
        }
        
        System.out.println("Очередь - " + linlist);

        Scanner iScanner = new Scanner(System.in);
        boolean flag = true;
        while (flag == true) {
            System.out.print("Выберите номер необходимого метода:\n1. Помещает элемент в конец очереди\n2." + 
            " Вовращает первый элемент очереди и удалает его\n3. Возвращает первый элемент из очереди, не удаляя его\n" +
            "4. Выход\n================ ");
            Integer method = iScanner.nextInt();
            switch (method) {
                case 1:
                    System.out.print("Введите элемент, который хотите поместить - ");
                    Integer element = iScanner.nextInt();
                    if (linlist.indexOf(element) >= 0) {
                        linlist.remove(linlist.indexOf(element));
                    }
                    linlist.add(linlist.size(), element);
                    System.out.println("Очередь - " + linlist);
                    break;
                case 2:
                    linlist.remove(0);
                    System.out.println("Очередь - " + linlist);
                    break;
                case 3:
                    linlist.add(linlist.size(), linlist.getFirst());
                    linlist.remove(0);
                    System.out.println("Очередь - " + linlist);
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        iScanner.close();
    }
}