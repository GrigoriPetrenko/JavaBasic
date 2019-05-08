package metanit.chapter_3.chapter_3_3.access.modifiers.and.encapsulation;

public class Person {
    String name;
    protected int age;
    public String adres;
    private String phone;

    public Person(String name, int age, String adres, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void displayName(){
        System.out.println("Name: " + name);
    }

    void displayAge(){
        System.out.println("Age: " + age);
    }

    private void displayAdres(){
        System.out.println("Adres: " + adres);
    }

    protected void displayPhone(){
        System.out.println("Phone: " + phone);
    }

}
