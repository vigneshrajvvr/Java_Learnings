package SOLID_Principles_Design_Patterns.prototypeRegistryDesignPattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        Client.fillRegistry(studentRegistry);
        Student s1 = new Student();
        s1.psp = 12.0;
        s1.name = "Mohit";
        Student s = s1.copy();

        Student st2 = studentRegistry.get("Apr23Student");
    }

    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student apr23Student = new Student();
        apr23Student.name = "Temp";
        apr23Student.psp = 100.0;

        studentRegistry.register("Apr23Student", apr23Student);
    }
}
