import java.util.Arrays;

public class GenericMethod {

    //  знаход макс елемнт у масиві
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null; // масив порожній або null, повертаємо null
        }

        T max = array[0]; //  перший елемент є макс

        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element; // знах більш елемнт
            }
        }

        return max; // поверт макс елемнт
    }

    public static void main(String[] args) {


        Integer[] intArray = {3, 5, 1, 9, 2};
        System.out.println("Max Integer: " + findMax(intArray));


        Double[] doubleArray = {1.1, 2.2, 3.3, 0.9};
        System.out.println("Max Double: " + findMax(doubleArray));


        Character[] charArray = {'a', 'z', 'e', 'r'};
        System.out.println("Max Character: " + findMax(charArray));


        String[] stringArray = {"apple", "banana", "pear", "peach"};
        System.out.println("Max String: " + findMax(stringArray));
    }
}
