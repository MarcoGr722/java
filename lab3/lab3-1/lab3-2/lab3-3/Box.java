
public class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
        System.out.println("Item placed in the box: " + item);
    }


    public T get() {
        System.out.println("Item retrieved from the box: " + item);
        return item;
    }

    // перевірка
    public boolean isEmpty() {
        return item == null;
    }

    public static void main(String[] args) {


        // створ бокс для зберіг данних
        Box<Integer> intBox = new Box<>();
        intBox.put(123);
        intBox.get();

        // створ бокс для зберіг рядків
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello, World!");
        stringBox.get();

        // створ бокс для зберіг дабл
        Box<Double> doubleBox = new Box<>();
        doubleBox.put(45.67);
        doubleBox.get();
    }
}
