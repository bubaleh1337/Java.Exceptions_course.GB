package sem1;
import java.util.Arrays;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class task3 {
    public static void main(String[] args){
        int[][] array = getArray( 5, 5);
        System.out.println(Arrays.deepToString(array));
        System.out.println(SumBin(array));
    }
    public static int SumBin(int[][] array){
        if (array.length != array[0].length) throw new RuntimeException("Массив не квадратный");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) throw new RuntimeException("Массив не бинарный " + i + " " + j);
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static int[][] getArray(int size1, int size2){
        int[][] array = new int[size1][size2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) array[i][j] = 0;
                else array[i][j] = 1;
            }
        }
        return array;
    }
}
