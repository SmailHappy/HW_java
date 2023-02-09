/*
Реализуйте структуру телефонной книги 
с помощью HashMap, учитывая, что 1 человек может 
иметь несколько телефонов.
*/

package HW_lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW_lesson_5_task_1 {
    public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();
        Scanner iScanner = new Scanner(System.in);
        
        Boolean flag = true;
        while (flag) {
            System.out.print("Write name: ");
            String user_name = iScanner.next();
            System.out.print("Write telephone number: ");
            String user_phone = iScanner.next();

            if (hmap.containsKey(user_name)) {
                hmap.put(user_name, hmap.get(user_name) + " ~ " + user_phone);
            } else {
                hmap.put(user_name, user_phone);
            }
         
            System.out.print("\n1. All contacts.\n2. New contact.\n3. End of program.\nYour choice --> ");
            String choice = iScanner.next();

            if (choice.equals("1")) {
                System.out.println(String.format("All contacts: \n%s\n", hmap));
                System.out.print("2. New contact.\n3. End of program.\nYour choice --> ");
                choice = iScanner.next();
            }

            if (choice.equals("3")) flag = false;
        }

        iScanner.close();
    }
}
