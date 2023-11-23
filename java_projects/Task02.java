package java_projects;

/**
 * task_02
 * Дан массив двоичных чисел, например [1,1,0,1,1,1],
 * вывести максимальное кол-во подряд идущих 1.
 **/
public class Task02 {
    public static void main(String[] args) {
        int[] array = { 1, 0, 1, 1, 0, 0, 1, 1 };
        System.out.println(numberUnitsInRow(array));
    }

    public static int numberUnitsInRow(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count += 1;
                // maxCount = count > maxCount ? count: maxCount;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
