/**
HW_lesson2_task1

Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
*/

package HW_lesson2;

import java.util.Scanner;
import java.io.FileWriter;

public class HW_lesson2_task1 {
     public static void main(String[] args) {
        System.out.println("Сортировка массива пузырьком, каждую итерацию записывает в лог-файл.");
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел через пробел.");
        String [] array_num = iScanner.nextLine().split(" ");
        iScanner.close();

        try {
            FileWriter writer = new FileWriter("File_for_task1.txt");
            writer.write(String.join(" ", array_num));
            writer.write(" - Начальный массив.\n");

            for (int i = 0; i < array_num.length - 1; i++) {
                for (int j = 0; j < array_num.length - 1 - i; j++) {
                    String temp = "";
                    if (Integer.parseInt(array_num[j]) > Integer.parseInt(array_num[j + 1])) {
                        temp = array_num[j + 1];
                        array_num[j + 1] = array_num[j];
                        array_num[j] = temp;
                    }
                }
                writer.write(String.join(" ", array_num));
                writer.write(" - " + (i + 1) + " Итерация завершена.\n");
                
            }
            System.out.println("Программа выполнена. Результат в файле 'File_for_task1.txt'.");
            writer.close();
        }
        catch (Exception e) {
            System.out.println("Что то не так.");
        }
    }
}
