import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Создаем список А и считываем 5 строк от пользователя
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для числа A:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        //Выводим список А
        System.out.println("Список А:");
        for (String str : listA){
            System.out.println(str);
        }

        //Создаем список Б и считываем 5 строк от пользователя
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для числа Б:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
            
        }

        //Выводим список Б
        System.out.println("Списк Б:");
        for (String str : listB){
            System.out.println(str);
        }

        //Объединяем списки А и Б в список С
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        //ВЫводим список С
        System.out.println("Список С до сортировки:");
        for (String str : listC){
            System.out.println(str);
        }

        //Сортируем элементы списка С по длине слова
        Collections.sort(listC, Comparator.comparingInt(String::length));

        //Выводим отсортированный список С
        System.out.println("Отсортированный список С:");
        for (String str : listC){
            System.out.println(str);
        }
    }
}