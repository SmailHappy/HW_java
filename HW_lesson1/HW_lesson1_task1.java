/**
* HW_lesson1_task1
* Вычислить n-ое треугольного число(сумма чисел от 1 до n),
* n! (произведение чисел от 1 до n) 
* тр 5 = 1+2+3+4+5 
* 5! = 1*2*3*4*5
*/

package HW_lesson1;

import java.util.Scanner;

public class HW_lesson1_task1 {
    public static void main(String[] args) {
        System.out.println("Вычисляет треугольное число и факториал числа N.");

        int input_number = 0;
    
        Scanner user_number = new Scanner(System.in);
        System.out.print("Введите число N: ");
        boolean flag = user_number.hasNextInt();
        if (flag == true) input_number = user_number.nextInt();
        user_number.close();

        // Вычисляет треугольное число
        String result = "T" + Integer.toString(input_number) + " = ";
        int sum = 1;

        for (int i = 1; i < input_number; i++) {
            result = result + Integer.toString(i) + " + ";
            sum = sum + i;
        }

        sum += input_number;
        result += Integer.toString(input_number) + " => " + Integer.toString(sum);

        // Вывод треугольного числа
        System.out.println(result);

        // Вычисляет факториал
        result = Integer.toString(input_number) + "! = ";
        sum = 1;

        for (int i = 1; i < input_number; i++) {
            result = result + Integer.toString(i) + " * ";
            sum = sum * i;
        }

        sum *= input_number;
        result += Integer.toString(input_number) + " => " + Integer.toString(sum);

        // Вывод факториала
        System.out.println(result);
    }
    
}