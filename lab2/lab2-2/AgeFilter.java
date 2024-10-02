import java.util.ArrayList;
import java.util.Iterator;

public class AgeFilter {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(15);
        ages.add(22);
        ages.add(17);
        ages.add(30);
        ages.add(10);


        Iterator<Integer> iterator = ages.iterator();
        while (iterator.hasNext()) {
            Integer age = iterator.next();
            if (age < 18) {
                iterator.remove();
            }
        }

        System.out.println("Ages 18 and older: " + ages);
    }
}
//2. Колекції: створіть ArrayList з цілих чисел, що представляють вік групи
//людей. Реалізуйте метод для видалення будь-якого віку молодше 18 за
//допомогою ітератора