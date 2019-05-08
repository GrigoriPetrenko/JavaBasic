package metanit.chapter_3.chapter_3_3.access.modifiers.and.encapsulation;

public class HumanEncapsulation {
    private String firstName;
    private int firstAge;

    public HumanEncapsulation(String firstName, int firstAge){
        this.firstName = firstName;
        this.firstAge = firstAge;

    }


    public String getFirstName() {
        return this.firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getFirstAge() {
        return this.firstAge;
    }

    public void setFirstAge(int firstAge) {
        if (firstAge > 0 && firstAge <110)
            this.firstAge = firstAge;
    }
}
