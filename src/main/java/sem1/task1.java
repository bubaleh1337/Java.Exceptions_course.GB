/* Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
иначе - длину массива.
 */

package sem1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task1 {
    public static void main(String[] args){
        int num = Prompt("Input a minimum size: ");
        getArray(10, num);
    }
    public static void getArray(int size, int min){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(0, 15);
        }
        if(array.length < min) System.out.println(-1);
        else System.out.println(array.length);
    }

    public static int Prompt(String msg){
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        int num = in.nextInt();
        return num;
    }

}
