import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Map структура вида key -> value
        Map<Integer, String> cars = new HashMap<>();// Создание мапы вида , ключ - инты, значение - строки
        // Пример: Хранение авто. Где их идентификатор является гос номером от 000 до 999
        String[] carType = new String[] {"Audi", "Lada", "Porsche", "Reno", "Nissan", "Toyota"}; // Возможная база машин
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int j = random.nextInt(6);
            cars.put(random.nextInt(999), carType[j]); // В ключ генерируем уникальный номер от 000 до 999.
            // В значение вставляем одну из 6 вариантов авто
        }
        System.out.println(cars); // Пример вывода в консоль все мапы.
        // Обратите внимание, что она обёрнута в {}, а не [] как массивы

        System.out.println(cars.size()); // Несмотря на особую структуру, подсчиатть эллементы всё-равно можно
        cars.put(65, "Test");
        System.out.println(cars);
        cars.put(65, "Test2"); // При попытке записи Value с одним key, второй (новый), перезаписывает первый.
        System.out.println(cars);

        Collection<String> values = cars.values();// Для получения всех Value, используем метод values() по аналоги с enam
        for (String s : values) {
            System.out.println(s); // Далее можно использовать перебор как с коллекцией или массивом
        }

        cars.remove(65); // Можно удалять конкретные элементы
        System.out.println(cars);

        cars.isEmpty(); // Можно проверить на пустоту.
    }
}
