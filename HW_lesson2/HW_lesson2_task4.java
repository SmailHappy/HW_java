/**
HW_lesson2_task4

К калькулятору из предыдущего дз добавить логирование.
*/

package HW_lesson2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class HW_lesson2_task4 {
    public static void main(String[] args) throws SecurityException, IOException {

        Logger log = Logger.getLogger(HW_lesson2_task4.class.getName());
        FileHandler handlers = new FileHandler("File_logger_task_4.txt");
        SimpleFormatter s_format = new SimpleFormatter();
        handlers.setFormatter(s_format);
        log.addHandler(handlers);

        System.out.println("Простой калькулятор чисел.");
    
        int input_number = 0;
        int input_number_two = 0;
        double res = 0;

        Scanner user_input = new Scanner(System.in);
        System.out.print("Доступные операции: '+'  |  '-'  |  '/'  |  '*'\nКакую операцию хотите выполнить? ");
        String input_operant = user_input.nextLine();
        log.info("Оператор пользователя - " + input_operant);


        if (input_operant.equals("+") || input_operant.equals("-") 
            || input_operant.equals("*") || input_operant.equals("/")) {

            System.out.print("Введите первое число: ");
            if (user_input.hasNextInt()) {
                input_number = user_input.nextInt();
                log.info( "Первое число пользователя - " + Integer.toString(input_number));

                System.out.print("Введите второе число: ");
                if (user_input.hasNextInt()) {
                    input_number_two = user_input.nextInt();
                    user_input.close();
                    log.info("Второе число пользователя - " + Integer.toString(input_number_two));

                    if (input_operant.equals("+")) res = input_number + input_number_two;
                    else if (input_operant.equals("-")) res = input_number - input_number_two;
                    else if (input_operant.equals("/")) res = input_number / input_number_two;
                    else if (input_operant.equals("*")) res = input_number * input_number_two;

                    String result = input_number + " " + input_operant + " " + input_number_two + " = " + res;
                    System.out.println(result);
                    log.info("Результат выполненой операции - " + Double.toString(res));
                } else {
                    System.out.println("Это не число. Перезапустите программу и попробуйте снова!");
                    log.info("Выполнение прервано - некорректное число");
                }
            } else {
                System.out.println("Это не число. Перезапустите программу и попробуйте снова!");
                log.info("Выполнение прервано - некорректное число");
            }
        } else {
            System.out.println("К сожалению такой операции здесь нету");
            log.info("Выполнение прервано - неверная операция");
        }
    }
}
