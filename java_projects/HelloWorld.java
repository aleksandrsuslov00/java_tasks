package java_projects;
// Настороить проект, вывести в консоль "Hello, World!".

// Вывести в консоль системные дату и время.

import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(LocalDateTime.now());

        int num = num();
        System.out.println(num());

        if (num == 0) {
            System.out.println();
        } else if (num != 0) {
            System.out.println();
        } else {
            System.out.println();
        }

        while (true) {
        }

        // int[] digits0 = new int[5];
        // int[] digits = { 4, 7, 3, 6, 1, 0, 2 };
        // digits[4] =

        
    }

    public static int num() {
        return 0;
    }
    
    public static void scanner(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in,"ibm866");
        String name = scanner.nextLine();
        System.out.println("Привет, "+ name + "!");
        scanner.close();
    }
}
