class Student {
    private String name;
    private int age;
    private String group;
    private String studentId;

    // конструктор
    public Student(String studentId, String name, int age, String group) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.group = group;
    }

    // геттери для  полів
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Group: " + group;
    }
}