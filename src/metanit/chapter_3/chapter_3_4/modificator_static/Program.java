package metanit.chapter_3.chapter_3_4.modificator_static;

public class Program {

    public static void main(String[] args) {

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 1
        bob.displayId();    // Id = 2
        System.out.println(Person.counter); // 3

        // изменяем Person.counter
        Person.counter = 8;

        Person sam = new Person();
        sam.displayId();    // Id = 8--??????
        sam.displayId();

        Person igor = new Person();

        igor.displayId();



    }

}
