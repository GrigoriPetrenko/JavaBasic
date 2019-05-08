package metanit.chapter_3.chapter_3_4.modificator_static;

public class Person{

    private int id;
    static int counter=1;

    Person(){
        id = counter++;
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
