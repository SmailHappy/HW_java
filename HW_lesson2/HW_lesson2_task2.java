/**
HW_lesson2_task1

Дана json строка (читать из файла и сохранить в файл) 

(ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Если .txt
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит json и, 
используя StringBuilder, создаст строки вида: 
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/

package HW_lesson2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW_lesson2_task2 {
    public static void main(String[] args) throws IOException {
        pars();
    }

    public static void pars() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("File_for_task_2.json"));

        String str;
        String text_file = "";
        Integer flag = 0;

        while ((str = reader.readLine()) != null) {
            text_file += str;
        }

        for (int index = 0; index < text_file.length(); index++) {
            char symbol = text_file.charAt(index);
            str = "";
            
            if (symbol == '{') {
                flag = 1;
                index += 1;

                while (flag != 0) {
                    symbol = text_file.charAt(index);

                    if (symbol == '}') {
                        flag -= 1;
                        index ++;
                    } else {
                        str += symbol;
                        index ++;
                    }
                }
                build(str);
            }
        }
        reader.close();
    }

    public static void build(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.split(",").length; i++) {
            switch (i) {
                case 0:
                    result.append("Студент ");
                    break;
                case 1:
                    result.append(" получил ");
                    break;
                case 2:
                    result.append(" по предмету ");
                    break;
            }
            result.append(str.replace('"', '+').replace("+", "").split(",")[i].split(":")[1]);
        }
        System.out.println(result);
    }
}
