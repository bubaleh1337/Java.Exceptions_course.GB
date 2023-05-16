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

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 6, 7, 8, 10};
        int[] arr2 = new int[]{1, 2, 5};
        System.out.println(arrsum(arr1, arr2));
        System.out.println(divarr(arr1, arr2));
    }
    public static ArrayList<Integer> arrsum(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов не равна.");
        } else {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < arr2.length; i++) {
                int num = arr1[i] + arr2[i];
                numbers.add(num);
            }
            return numbers;
        }
    }
    public static ArrayList<Float> divarr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов не равна.");
        } else {
            ArrayList<Float> numbers = new ArrayList<>();
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Делить на ноль нельзя.");
                } else {
                    Float num = (float) arr1[i] / arr2[i];
                    numbers.add(num);
                }
            }
            return numbers;
        }
    }
}
