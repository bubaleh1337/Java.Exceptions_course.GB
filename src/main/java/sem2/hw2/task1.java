package sem2.hw2;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
запросить у пользователя ввод данных.
 */
public class task1 {
    public static void main(String[] args) {
        GetNum();
    }

    public static void GetNum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        float num = in.nextFloat();
        System.out.println(num);
        if (num == in.nextFloat()) {
            System.out.println(num);
        } else {
            System.out.println("Число не дробное.\n");
            GetNum();
        }
    }

}
