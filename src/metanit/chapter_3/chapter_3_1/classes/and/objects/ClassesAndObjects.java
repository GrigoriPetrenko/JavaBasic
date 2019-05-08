package metanit.chapter_3.chapter_3_1.classes.and.objects;

public class ClassesAndObjects {


    public static void main(String[] args){

        People people = new People();// создание объекта конструктор
        people.dispalyPerson();

        People tom = new People();// создание нового объекта конструктор
        tom.name = "Tom";
        tom.age = 26;
        tom.dispalyPerson();
        //jast comment

        People bob = new People("Bob");//конструктор
        bob.dispalyPerson();

        People monika = new People("Monika", 43);//конструктор
        monika.dispalyPerson();


    }

}
