package sem1;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит
искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый
результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
*/
public class task2 {
    public static void main(String[] args){
        int[] array = getArray(10);
        int[] array1 = null;
        System.out.println(Arrays.toString(array));
        PrintCodeExeptions(findArray(array, 1, 4));
        PrintCodeExeptions(findArray(array, 11, 4)); // -1
        PrintCodeExeptions(findArray(array, 1, 55)); // -2
        PrintCodeExeptions(findArray(array1, 1, 4)); // -3
    }
    public static int[] getArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(0, 15);
        }
        return array;
    }
    public static int findArray(int[] array, int min, int el){
        if(array == null) return -3;
        if(array.length < min) return -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == el) {
                return i + 1;
            }
        }
        return -2;
    }
    public static void PrintCodeExeptions(int code) {
        if (code == -3) System.out.println("Вместо массива пришел null");
        else if (code == -2) System.out.println("Искомый элемент не найден");
        else if (code == -1) System.out.println("Длина массива меньше некоторого заданного минимума");
        else System.out.println("Индекс = " + code);
    }
}
