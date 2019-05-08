package metanit.chapter_3.chapter_3_1.classes.and.objects;

class People{

    String name;
    int age;

    //инициализатор мы можем поместить код, общий для всех конструкторов:
    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/

    People(){

        name = "undefined";
        age = 1;
        //или использовать такую запись: this("undefined", 6);
    }

    People(String name){

        //name = n;
        //age = 2;
        this(name, 4);
    }

    People(String n, int a){

        //name = n;
        this.name = n;
        this.age = a;
    }

    void dispalyPerson(){

        System.out.println("Name: " + name + " Age: " + age);
    }
}
