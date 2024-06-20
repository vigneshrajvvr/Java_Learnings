package SOLID_Principles_Design_Patterns.prototypeRegistryDesignPattern;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }
    @Override
    public IntelligentStudent copy() {
        IntelligentStudent s = new IntelligentStudent(this);
        return s;
    }
}
