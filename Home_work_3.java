import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;

public class Home_work_3 {
    public static void main(String[] args) {
        // Создать новый список, добавить несколько строк и вывести коллекцию на экран.   
        ArrayList<String> list = new ArrayList<>();
        list.add("Красный");
        list.add("Оранжевый");
        list.add("Желтый");
        list.add("Зеленый");
        list.add("Голубой");
        list.add("Синий");
        list.add("Фиолетовый");
        System.out.println(list);
        for (String str : list) {
            System.out.println(str);
            }
        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        Iterator<String> itr = list.iterator();
            while (itr.hasNext()) {
                Object element = itr.next();
                System.out.print(element + "! ");
            }
        // Вставить элемент в список в первой позиции.
        System.out.println();
        System.out.println();
        list.add(1, "Белый");
            for (String str : list) {System.out.println(str);
        }
        // Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println();
        System.out.println(list.get(5));

        // Обновить определенный элемент списка по заданному индексу.
        list.set(0, "Ярко-Красный");
        System.out.println();
        System.out.println(list);

        // Удалить третий элемент из списка.
        list.remove(2);
        System.out.println();
        System.out.println(list);

        // Поиска элемента в списке по строке.
        System.out.println();
        System.out.println(list.contains("Белый"));

        // Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("день");
        list1.add("ночь");
        list1.add("утро");
        list1.add("вечер");
        list1.add(list.get(4));
        list1.add(list.get(5));
        list1.add(list.get(6));
        System.out.println();
        System.out.println(list1);

        // Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println();
        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);
        list.retainAll(list1);
        System.out.println();
        System.out.println(list);

        // *Сортировка списка.
        Collections.sort(list1);
        System.out.println();
        System.out.println("sorted list1 = " + list1);


}
}