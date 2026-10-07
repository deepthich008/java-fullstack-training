public class Student {
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void showDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }
}