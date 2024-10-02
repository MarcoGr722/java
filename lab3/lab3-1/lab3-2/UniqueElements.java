import java.util.*;

public class UniqueElements {

    // метод для отрим елемнт з ліста
    public static <T> Set<T> getUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }

    // метод для підрах кіл-ті вход кожного елемнт
    public static <T> Map<T, Integer> countOccurrences(List<T> list) {
        Map<T, Integer> countMap = new HashMap<>();
        for (T element : list) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }
        return countMap;
    }

    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");


        Set<String> uniqueItems = getUniqueElements(items);
        System.out.println("унікальні елементи: " + uniqueItems);

        // підрахунок вход кожного елемнт
        Map<String, Integer> occurrences = countOccurrences(items);
        System.out.println("кількість входжень: " + occurrences);
    }
}
