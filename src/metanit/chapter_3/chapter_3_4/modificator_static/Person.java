package metanit.chapter_3.chapter_3_4.modificator_static;

public class Person{

    private int id;
    protected static int counter = 1;

    static{
        counter = 105;
        System.out.println("Static initializer");
    }

    Person(){

        id = counter++;
        System.out.println("Constructor");
    }

    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
