package ru.geekbrains.homework;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Дерево", "Трава", "Мост", "Дрога", "Дерево", "Дорога", "Небо", "Газон", "B", "К", "П", "Е", "Ц",
                "Э", "Д", "В"));

        System.out.println(set);
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str1 = iter.next();
            System.out.println(str1);
        }
    }
}


