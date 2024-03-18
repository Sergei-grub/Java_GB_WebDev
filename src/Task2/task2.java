package Task2;

import java.util.Arrays;

/**
 * 1. Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 *
 * 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 *
 * 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class task2 {

    static void task1_1(){
        /**
         * Метод, возвращающий количество чётных элементов массива
         */
        int[] arr = {1, 3, 5, 4, 8, 11};
        int countEvens = 0;
        for (int item : arr) {
            if (item % 2 == 0) countEvens++;
        }
        System.out.println(Arrays.toString(arr) + " > " + countEvens);
    }

    static void task1_2(int[] arr){
        /**
         * Функция, возвращающая разницу между самым большим и самым
         * маленьким элементами переданного не пустого массива
         */
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        System.out.print("Разница между самым большим и самым маленьким элементами массива: ");
        System.out.println(max - min);
    }
    static boolean task1_3(int[] arr2){
        /**
         * Функция, возвращающая истину, если в переданном массиве
         * есть два соседних элемента, с нулевым значением
         */
        int temp = 0;

        for(int i = 1; i < arr2.length - 1; i++) {
            if (arr2[i] == temp && arr2[i + 1] == temp) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        task1_1();

        int[] arr = {1, 10, 30};
        task1_2(arr);

        int[] arr2 = {7, 10, 0, 10, 1, 0, 2};
        System.out.println(task1_3(arr2));
    }
}

