package java_projects;

/**
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в
 * промежутке от 1 до 1000, каждое на новой строке.
 * Напишите свой код в методе printPrimeNums класса Answer.
 * Пример: 2 3 5 7 11
 **/

class Calculator {
    public int calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return add(a, b);
            case '-':
                return minus(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Некорректный оператор: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}

public class HWTask03{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            a = 12;
            op = '/';
            b = 4;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}