package sem1;
/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */
public class task4 {
    public static void main(String[] args){
        checkArray(new Integer[]{1, 2, 3, 6, 7, 8, 10});
        checkArray(new Integer[]{1, 2, 3, null, 6, 7, 8, null, 10});
    }

    public static void checkArray(Integer[] arr){
        String errIndex = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                errIndex += " " + i;
            }
        }
        if (errIndex != "") throw new RuntimeException("Индексы ошибок " + errIndex);
        else System.out.println("Ошибок нет");
    }
}
