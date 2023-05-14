package sem2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Запишите в файл следующие строки:

Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4

Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
заменить его на соответствующее число.

Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.
 */
public class task1 {


    public static ArrayList<String> ReadFile() {
        File file = new File("data_for_task1");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            ArrayList<String> arr = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                arr.add(line);
            }
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<String>();
    }
    public static ArrayList<String> convert(ArrayList<String> List_name2) { // на вход принимаем массив, считанный с файла
        ArrayList<String> List_name = new ArrayList<>(); // создаем новый массив строк
        for (int i = 0; i < List_name2.size(); i++) { // перебираем строки изначального массива
            int size = List_name2.get(i).length(); // размер каждой строки
            StringBuilder sb2 = new StringBuilder("");
            for (int j = 0; j < size; j++) { // перебираем все элементы нашей строки
                if (List_name2.get(i).charAt(j) == '?') { // если наш элемент - это строка,
                    StringBuilder sb = new StringBuilder();
                    sb2.append(size - 2); // то мы в StringBuilder кладем в него size - 2 (узнаем длину нашего int)
                }
                else {
                    sb2.append(List_name2.get(i).charAt(j));
                }
            } List_name.add(sb2.toString());
        }
        return List_name;
    }
    public static void main(String[] args){
        ArrayList<String> arr1 = convert(ReadFile());
        try (BufferedWriter br = new BufferedWriter(new FileWriter("txt2.txt")))
        {
            String line;
            for (String i:arr1) {
                br.write(i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
