import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення списку
        List<String> myList = new ArrayList<>();

        // Заповнення списку 10 елементами
        for (int i = 1; i <= 10; i++) {
            myList.add("Елемент " + i);
        }

        // Виведення елементів списку за допомогою Iterator
        System.out.println("Вміст списку:");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
