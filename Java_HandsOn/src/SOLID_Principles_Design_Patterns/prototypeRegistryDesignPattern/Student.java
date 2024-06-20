package SOLID_Principles_Design_Patterns.prototypeRegistryDesignPattern;

public class Student implements Prototype<Student>{
    int id;
    String name;
    double psp;

    public Student() {

    }

    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.psp = other.psp;
    }

    @Override
    public Student copy() {
        Student s = new Student(this);
        return s;
    }
}
