package seminar2;

/**
 * Task01
 * Дано четное число N (>0) и символы с1 и с2.
 * Написать метод, который вернет строку длины N, которая
 * состоит из чередующихся символов с1 и с2, начиная с с1.
 **/

public class Task01 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        int N = 14;

        String sbRes = rowCharacterSb(N, c1, c2);

        String strRes = rowCharacterStr(N, c1, c2);

        System.out.println(sbRes);
        System.out.println(strRes);

    }

    public static String rowCharacterSb(int count, char c1, char c2) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count / 2; i++) {
            sb.append(c1).append(c2); // добавили с1 и с2 в sb
            // sb.append(c1 + c2) : так написать нельзя, так как складываются чары (символы
            // кода, не цифры)
        }
        return sb.toString();
    }

    public static String rowCharacterStr(int count, char c1, char c2) {
        String str = "";
        for (int i = 0; i < count / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2); 
            //складывать str + str можно
        }
        return str;
    }
}
