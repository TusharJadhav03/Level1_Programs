
public class Student {

    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {

        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void studentPrint() {
        System.out.println(name + " " + age);
    }

    public void setName(String name) {
        name = this.name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        age = this.age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        id = this.id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

        Student s = new Student("Tushar", 24, 101);
        Student s2 = new Student("Anjali", 22, 102);
        s.studentPrint();
        s2.studentPrint();
    }
}