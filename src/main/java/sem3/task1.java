package sem3;

import java.util.Arrays;

/*
Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
(тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение,
которое вызвал метод doSomething().
 */
public class task1 {
    public static void main(String[] args){
        int[] arr = GetArray();
        if (arr.length == 0) {
            doSomething();
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[] GetArray(){
        int[] arr = new int[]{1, 2, 3, 4};
        return arr;
    }
    public static void doSomething() {
        throw new RuntimeException("Пустой массив.");
    }
}
