package seminar2;

/**
 * Task02
 * Напишите метод который сжимает строку.
 * дано: aaaabbbcdd
 * нужно сделать: a4b3с1d2
 **/

public class Task02 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compressString(str));

    }

    public static String compressString(String str) {

        char currentChar = str.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }

        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }
}
