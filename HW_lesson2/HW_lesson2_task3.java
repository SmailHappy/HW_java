/**
HW_lesson2_task3

Напишите метод, который принимает на вход строку(String) 
и определяет является ли строка палиндромом (возвращает boolean значение).
*/

package HW_lesson2;

import java.util.Scanner;

public class HW_lesson2_task3 {
    public static void main(String[] args) {
        System.out.println("Определяет является ли строка палиндромом.");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите строку.");
        String user_input = iScanner.next();
        iScanner.close();

        System.out.println(polindrom(user_input));
    }
    
    public static boolean polindrom(String args) {
        for (int i = 0; i < args.length(); i++) {
            if (args.charAt(i) != args.charAt(args.length() - 1 - i)) return false;
        }
        return true;
    }
}
