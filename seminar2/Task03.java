package seminar2;

/**
 * Task03
 * Напишите метод, который принимает на вход строку (стринг) и определяет
 * является ли строка палиндромом (возвращает boolean значение).
 **/

public class Task03 {
    public static void main(String[] args) {
        String str = "Шалаш"; // следим за регистром!
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        // char left = str.charAt(0);
        int right = str.length() - 1;
        for (int left = 0; left < right; left++) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            right--;
        }
        return true;
    }
}
