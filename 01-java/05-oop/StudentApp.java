public class StudentApp{
    public static void main(String[] args){
       Student stu1 = new Student("Tom", 8, 11);
       Student stu2 = new Student(null, 6,1);
       stu1.showDetails();
       stu2.showDetails();
       String name1 = stu1.getName();
       String name2 = stu1.getName();
       System.out.println(name1);
       System.out.println(name2);
       int age1 = stu1.getAge();
       int age2 = stu2.getAge();
        System.out.println(age1);
        System.out.println(age2);
        int grade1 = stu1.getGrade();
        int grade2 = stu2.getGrade();
        System.out.println(grade1);
        System.out.println(grade2);
        stu1.setName("Thomas");
        stu1.setName("Robert");
        System.out.println(stu1.getName());
        System.out.println(stu2.getName());
        stu1.setAge(-10);
        stu2.setAge(-13);
        System.out.println(stu1.getAge());
        System.out.println(stu2.getAge());
        stu1.setGrade(12);
        stu2.setGrade(17);
        System.out.println(stu1.getGrade());
        System.out.println(stu2.getGrade());

    }
}