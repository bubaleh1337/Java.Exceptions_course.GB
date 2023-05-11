package sem1.hw1;

/*
Реализуйте 2 метода, чтобы в каждом из них получить разные исключения
1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. (+ проверка на null)

2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
пользователь может увидеть - RuntimeException, т.е. ваше. (+ деление на ноль)
*/

import java.util.Arrays;

public class task1 {
    public static void main(String[] args){
        Integer[] arr1 = new Integer[]{1, 2, 3, 6, 7, 8, 10};
        Integer[] arr2 = new Integer[]{1, 2, 3, null, 6, 7, 8, null, 10};
        System.out.println("Массив 1: " + Arrays.toString(arr1) + "\nМассив 2:  " + Arrays.toString(arr2));
        checkArrays(arr1, arr2);

    }
    public static void checkArrays(Integer[] arr1, Integer[] arr2) {
        int[] arr3 = new int[]{};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == null || arr2[j] == null) throw new RuntimeException("Элемент под индексом " + i + "равен null");
                else arr3[i] = arr1[i] - arr2[j];
            }
        }
        System.out.println("\nМассив 3: " + Arrays.toString(arr3));
        if (arr1.length != arr2.length) throw new RuntimeException("Длины массиов не равны.");
    }
}
