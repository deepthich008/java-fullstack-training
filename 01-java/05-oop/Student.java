public class Student {
    private String name;
    private int age;
    private int grade;

    Student(String name, int age, int grade) {
            setName(name);
            setAge(age);
            setGrade(grade);
    }

    void showDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
         return age;
    }
    public int getGrade()
    {
        return grade;
    }
    public void setName(String name)
    {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name can't be null or blank");
        }
        this.name = name;
    }
    public void setAge(int age)
    {
        if(age<=0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
            this.age = age;
    }
    public void setGrade(int grade)
    {
            if(grade < 1 || grade > 12) {
                throw new IllegalArgumentException("Grade must be within 1 & 12");
            }
               this.grade = grade;
    }
}