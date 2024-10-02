import java.util.List;
import java.util.Objects;

public class Pair<F, S> {
    private F first;
    private S second;

    // конструкт
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }
    //метод доступу для S , F
    public S getSecond() {
        return second;
    }

    //  порівн двох пар
    public boolean equals(Pair<F, S> other) {
        return Objects.equals(this.first, other.getFirst()) && Objects.equals(this.second, other.getSecond());
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    public static void main(String[] args) {



        Pair<Integer, String> intStringPair = new Pair<>(1, "One");
        System.out.println(intStringPair);


        Pair<String, List<Integer>> stringListPair = new Pair<>("Numbers", List.of(1, 2, 3));
        System.out.println(stringListPair);


        Pair<Integer, String> anotherIntStringPair = new Pair<>(1, "One");
        System.out.println("Чи рівні пари? " + intStringPair.equals(anotherIntStringPair));

        Pair<String, List<Integer>> anotherStringListPair = new Pair<>("Numbers", List.of(1, 2, 3));
        System.out.println("Чи рівні пари? " + stringListPair.equals(anotherStringListPair));
    }
}
