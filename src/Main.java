import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Java Collections API
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            list.add("String -" + i);//mas[i] = i;
        }
        System.out.println(list);//Arrays.toString(mas)
        list.add(4,"New String"); // Добавление элемента на конкретное место
        System.out.println(list.size());// Обратить внимание, что элементов теперь 51, а не 50

        System.out.println(list.get(5)); //mas[5]
        System.out.println(list);

        // Вариант прохода через коллекцию не отличается от массива
        for (String s : list) {
            System.out.println("Считываем элемент: " + s);
        }

        System.out.println(list.indexOf("String -5"));// Позволяет найти конкретный элемент и узнать его индекс
        System.out.println(list.contains("String -5"));// Позволяет узнать, есть ли элемент в коллекции
    }
}
