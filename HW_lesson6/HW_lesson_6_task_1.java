package HW_lesson6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW_lesson_6_task_1 {
    public static void main(String[] args) {
        ArrayList<Notebook> nb_list = new ArrayList<>();
        nb_list = create_nb_list(nb_list, 15);

        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Добро пожаловать в консоль!");
        System.out.println("1. Вывести весь список ноутбуков" +
                            "\n2. Отфильтровать");
        String choice = iScanner.next();
        

        if (choice.equals("1")) {
            for (Notebook iterable_element : nb_list) {
                System.out.println();
                System.out.println(iterable_element);
            }
        } else Filtr(nb_list);
        iScanner.close();
    }
    
    public static void Filtr(ArrayList<Notebook> nb_list) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        
        System.out.println("Критерий фильтрации: " +
                                "\n\t1. Цвет" +
                                "\n\t2. Диагональ" +
                                "\n\t3. Обьем памяти" +
                                "\n\t4. Обьем оперативной памяти" +
                                "\n\t5. Тип оперативной памяти" +
                                "\n\t6. Тип памяти хранения" +
                                "\n\t7. Операционная система" +
                                "\n\t8. Цена");
        String choice = iScanner.next();
        String [] result;

        switch (choice) {
            case "1":
                System.out.println("\nВыберите интересующий цвет из списка : ");
                result = Parameters("color_device", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print((i + 1) + "." + result[i] + "   ");
                }
                System.out.print("\nВаш выбор -> ");
                choice = iScanner.next();
                for (Notebook iterable_element : nb_list) {
                    if (iterable_element.getDevice_color().equals(result[Integer.parseInt(choice) - 1])) {
                        System.out.println();
                        System.out.println(iterable_element);
                    } 
                }
                break;
            case "2":
                System.out.print("\nИмеющиеся значения : ");
                result = Parameters("diagonal", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print((i + 1) + " - " + result[i] + "   ");
                }
                System.out.print("\nВаш выбор -> ");
                choice = iScanner.next();
                for (Notebook iterable_element : nb_list) {
                    if (iterable_element.getDiagonal().equals(Double.parseDouble(result[Integer.parseInt(choice) - 1]))) {
                        System.out.println();
                        System.out.println(iterable_element);
                    } 
                }
                break;
            case "3":
                System.out.print("\nИмеющиеся значения : ");
                result = Parameters("device_memory", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + "   ");
                }
                System.out.print("\nВведите минимальное значение : ");
                if (iScanner.hasNextInt()) {
                    Integer min = iScanner.nextInt();
                    System.out.print("Введите максимальное значение : ");
                    if (iScanner.hasNextInt()) {
                        Integer max = iScanner.nextInt();
                        for (Notebook iterable_element : nb_list) {
                            if (iterable_element.getDevice_memory() > min && iterable_element.getDevice_memory() < max) {
                                System.out.println();
                                System.out.println(iterable_element);
                            } 
                        }
                    } else {
                        System.out.println("\nНе число");
                    }
                } else {
                    System.out.println("\nНе число");
                }
                break;
            case "4":
                System.out.print("\nИмеющиеся значения : ");
                result = Parameters("ram", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + "   ");
                }
                System.out.print("\nВведите минимальное значение : ");
                if (iScanner.hasNextInt()) {
                    Integer min = iScanner.nextInt();
                    System.out.print("Введите максимальное значение : ");
                    if (iScanner.hasNextInt()) {
                        Integer max = iScanner.nextInt();
                        for (Notebook iterable_element : nb_list) {
                            if (iterable_element.getRam() > min && iterable_element.getRam() < max) {
                                System.out.println();
                                System.out.println(iterable_element);
                            } 
                        }
                    } else {
                        System.out.println("\nНе число");
                    }
                } else {
                    System.out.println("\nНе число");
                }
                break;
            case "5":
                System.out.println("\nВыберите тип из списка : ");
                result = Parameters("type_ram", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print((i + 1) + "." + result[i] + "   ");
                }
                System.out.print("\nВаш выбор -> ");
                choice = iScanner.next();
                for (Notebook iterable_element : nb_list) {
                    if (iterable_element.getType_ram().equals(result[Integer.parseInt(choice) - 1])) {
                        System.out.println();
                        System.out.println(iterable_element);
                    } 
                }
                break;
            case "6":
                System.out.println("\nВыберите тип из списка : ");
                result = Parameters("type_memory", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print((i + 1) + "." + result[i] + "   ");
                }
                System.out.print("\nВаш выбор -> ");
                choice = iScanner.next();
                for (Notebook iterable_element : nb_list) {
                    if (iterable_element.getType_memory().equals(result[Integer.parseInt(choice) - 1])) {
                        System.out.println();
                        System.out.println(iterable_element);
                    } 
                }
                break;    
            case "7":
                System.out.println("\nВыберите ОС из списка : ");
                result = Parameters("os", 1).toString().split(",");
                for (int i = 0; i < result.length; i++) {
                    System.out.print((i + 1) + "." + result[i] + "   ");
                }
                System.out.print("\nВаш выбор -> ");
                choice = iScanner.next();
                for (Notebook iterable_element : nb_list) {
                    if (iterable_element.getOperating_system().equals(result[Integer.parseInt(choice) - 1])) {
                        System.out.println();
                        System.out.println(iterable_element);
                    } 
                }
                break;
            case "8":
                System.out.print("\nВведите минимальную цену : ");
                if (iScanner.hasNextInt()) {
                    Integer min = iScanner.nextInt();
                    System.out.print("Введите максимальную цену : ");
                    if (iScanner.hasNextInt()) {
                        Integer max = iScanner.nextInt();
                        for (Notebook iterable_element : nb_list) {
                            if (iterable_element.getPrice() > min && iterable_element.getPrice() < max) {
                                System.out.println();
                                System.out.println(iterable_element);
                            } 
                        }
                    } else {
                        System.out.println("\nНе число");
                    }
                } else {
                    System.out.println("\nНе число");
                }
                break;          
        }
        iScanner.close();
    }

    public static ArrayList<Notebook> create_nb_list(ArrayList<Notebook> nb_list, Integer count) {
        for (int i = 0; i < count; i++) {
            Notebook notebook = new Notebook(Parameters("manufacturer", 0).toString(), 
                                            Parameters("model", 0).toString(), 
                                            Parameters("color_device", 0).toString(), 
                            Double.parseDouble(Parameters("diagonal", 0).toString()), 
                            Integer.parseInt(Parameters("device_memory", 0).toString()), 
                                            Parameters("type_memory", 0).toString(),
                            Integer.parseInt(Parameters("ram", 0).toString()), 
                                            Parameters("type_ram", 0).toString(), 
                                            Parameters("os", 0).toString(), 
                            Integer.parseInt(Parameters("price", 0).toString()));
            nb_list.add(notebook);    
        }
        return nb_list;
    }

    public static Object Parameters(String name_parameters, Integer mode) {
        String [] color_device = new String[] {"black", "white", "red", "grey", "blue", "green", "yellow", "golden", "brown", "purple"};
        String [] models = new String[] {"Modern", "IdeaPad", "Extensa", "MacBook"};
        String [] manufacturer = new String[] {"MSI", "Acer", "Apple", "Lenovo"};
        String [] os = new String[] {"Windows", "Linux", "macOS", "None"};
        Double [] diagonal = new Double[] {13.3, 14.0, 15.6, 17.3};
        Integer [] device_memory = new Integer[] {128, 256, 512, 1024, 2048, 4096};
        String [] type_memory = new String[] {"SSD", "HDD", "SHDD"};
        Integer [] ram = new Integer[] {2, 4, 8, 16, 32, 64};
        String [] type_ram = new String[] {"DDR2", "DDR3", "DDR4", "DDR5"};
        
        Random rmd = new Random();

        if (mode == 0) {
            switch (name_parameters) {
                case "manufacturer":
                    return manufacturer[rmd.nextInt(manufacturer.length)];
                case "model":
                    return models[rmd.nextInt(models.length)] + " " + rmd.nextInt(10);
                case "color_device":
                    return color_device[rmd.nextInt(color_device.length)];
                case "diagonal":
                    return diagonal[rmd.nextInt(diagonal.length)];
                case "device_memory":
                    return device_memory[rmd.nextInt(device_memory.length)];
                case "type_memory":
                    return type_memory[rmd.nextInt(type_memory.length)];
                case "ram":
                    return ram[rmd.nextInt(ram.length)];
                case "type_ram":
                    return type_ram[rmd.nextInt(type_ram.length)];
                case "os":
                    return os[rmd.nextInt(os.length)];
                case "price":
                    return rmd.nextInt(100000);
                default :
                    return "";
            }
        } else {
            switch (name_parameters) {
                case "manufacturer":
                    return String.join(",", manufacturer);
                case "model":
                    return String.join(",", models);
                case "color_device":
                    return String.join(",", color_device);
                case "diagonal":
                    String [] ret_diag = new String[diagonal.length];
                    for (int i = 0; i < ret_diag.length; i++) {
                        ret_diag[i] = Double.toString(diagonal[i]);
                    }
                    return String.join(",", ret_diag);
                case "device_memory":
                    String [] ret_devmemory = new String[device_memory.length];
                    for (int i = 0; i < ret_devmemory.length; i++) {
                        ret_devmemory[i] = Integer.toString(device_memory[i]);
                    }
                    return String.join(",", ret_devmemory);
                case "type_memory":
                    return String.join(",", type_memory);
                case "ram":
                    String [] ret_ram = new String[ram.length];
                    for (int i = 0; i < ret_ram.length; i++) {
                        ret_ram[i] = Integer.toString(ram[i]);
                    }
                    return String.join(",", ret_ram);
                case "type_ram":
                    return String.join(",", type_ram);
                case "os":
                    return String.join(",", os);
                default :
                    return "";
            }
        }
    }
}