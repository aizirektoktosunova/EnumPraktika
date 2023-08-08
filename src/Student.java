public class Student {
    private  int id;
    private String name;
    private String lastName;
    private int age;
    private Course course;

    public Student(int id, String name, String lastName, int age, Course course) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}

