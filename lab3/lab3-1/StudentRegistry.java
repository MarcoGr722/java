import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    private Map<String, Student> studentMap;

    // конструктор
    public StudentRegistry() {
        studentMap = new HashMap<>();
    }

    // метод для додав студ
    public void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
        System.out.println("Student added: " + student.getName());
    }

    // метод для видал студ за айді
    public void removeStudent(String studentId) {
        Student removedStudent = studentMap.remove(studentId);
        if (removedStudent != null) {
            System.out.println("Student removed: " + removedStudent.getName());
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    // метод для пошуку студ за айді
    public Student searchStudent(String studentId) {
        return studentMap.get(studentId);
    }

    // метод для відображ списку всіх студ
    public void displayAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students in the registry.");
        } else {
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }
}


