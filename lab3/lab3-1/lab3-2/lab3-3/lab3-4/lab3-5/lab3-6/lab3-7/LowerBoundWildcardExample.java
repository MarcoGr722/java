import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {


    public static void addToList(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        addToList(intList);
        System.out.println("Список цілих чисел: " + intList);


        List<Number> numList = new ArrayList<>();
        addToList(numList);
        System.out.println("Список чисел: " + numList);
    }
}
