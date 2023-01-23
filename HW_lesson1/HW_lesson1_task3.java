/**
* HW_lesson1_task3
* Реализовать простой калькулятор 
Scanner sc = ... int a = sc.nextLine int b = sc.nextLine
1 + 2
ответ:
3
*/

package HW_lesson1;

import java.util.Scanner;

public class HW_lesson1_task3 {
    public static void main(String[] args) {
        System.out.println("Простой калькулятор чисел.");
    
        int input_number = 0;
        int input_number_two = 0;
        double res = 0;

        Scanner user_input = new Scanner(System.in);

        System.out.print("Доступные операции: '+'  |  '-'  |  '/'  |  '*'\nКакую операцию хотите выполнить? ");
        String input_operant = user_input.nextLine();

        if (input_operant.equals("+") || input_operant.equals("-") 
            || input_operant.equals("*") || input_operant.equals("/")) {

            System.out.print("Введите первое число: ");
            if (user_input.hasNextInt()) {
                input_number = user_input.nextInt();

                System.out.print("Введите второе число: ");
                if (user_input.hasNextInt()) {
                    input_number_two = user_input.nextInt();
                    user_input.close();

                    if (input_operant.equals("+")) res = input_number + input_number_two;
                    else if (input_operant.equals("-")) res = input_number - input_number_two;
                    else if (input_operant.equals("/")) res = input_number / input_number_two;
                    else if (input_operant.equals("*")) res = input_number * input_number_two;

                    String result = input_number + " " + input_operant + " " + input_number_two + " = " + res;
                    System.out.println(result);
                }
                else System.out.println("Это не число. Перезапустите программу и попробуйте снова!");
            }
            else System.out.println("Это не число. Перезапустите программу и попробуйте снова!");
        }
        else System.out.println("К сожалению такой операции здесь нету");
    }
}
