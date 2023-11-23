package java_projects;

import java.util.Arrays;

/**
 * Task03
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному. нуждно перенести
 * эти эл-ты в конец массива.
 * Таким образом, первые несколько (иле все) эл-тов массива
 * должны быть отличены от заданного, а остальные - равны ему.
 **/
public class Task03 {
    public static void main(String[] args) {
        int[] array = { 3, 1, 3, 3, 4, 3 };
        int val = 3;
        moveToEnd(array, val);
        System.out.println(Arrays.toString(array));
    }

    public static void moveToEnd(int[] array, int val) {

        // int left = 0;
        int right = array.length - 1;
        // right = 3

        for (int left = 0; left < right; left++) {
            while (array[left] == val && right > left)
                right--;
            if (array[left] == val) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                right--;
            }

        }
    }
}
