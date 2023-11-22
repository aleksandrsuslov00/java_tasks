package java_projects;

import java.util.Scanner;

/**
 * task_01
 * Написать программу, которая запросит пользователя ввести 
 * <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>". 
 */
public class Task01 {
    public static void main(String[] args) {    
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in,"ibm866");
        String name = scanner.nextLine();
        System.out.println("Привет, "+ name + "!");
        scanner.close();

    }
    
}