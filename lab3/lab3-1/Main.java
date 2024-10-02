

public class Main {
    public static void main(String[] args) {
        // створ реєстру студ
        StudentRegistry registry = new StudentRegistry();

        // дод. студ
        Student student1 = new Student("001", "Alice", 20, "CS101");
        Student student2 = new Student("002", "Bob", 21, "CS102");
        Student student3 = new Student("003", "Charlie", 22, "CS101");

        registry.addStudent(student1);
        registry.addStudent(student2);
        registry.addStudent(student3);

        // список всіх студ
        System.out.println("\nList of all students:");
        registry.displayAllStudents();

        // пошук студ за айди
        System.out.println("\nSearching for student with ID 002:");
        Student foundStudent = registry.searchStudent("002");
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        // видал студ
        System.out.println("\nRemoving student with ID 003:");
        registry.removeStudent("003");

        // Відображ всіх студ після видал
        System.out.println("\nList of all students after removal:");
        registry.displayAllStudents();
    }
}