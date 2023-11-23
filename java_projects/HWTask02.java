package java_projects;

/**
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в
 * промежутке от 1 до 1000, каждое на новой строке.
 * Напишите свой код в методе printPrimeNums класса Answer.
 * Пример: 2 3 5 7 11
 **/

/**
 * HWTask02
 */
public class HWTask02 {

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean simple = false;
            for (int j = 2; j * j <= i; j++) {
                simple = (i % j == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(i + " ");
            }
        }
    }
}

