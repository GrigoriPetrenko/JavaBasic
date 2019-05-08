package metanit.chapter_3.chapter_3_3.access.modifiers.and.encapsulation;

//public: публичный, общедоступный класс или член класса.
// Поля и методы, объявленные с модификатором public, видны другим классам из текущего пакета и из внешних пакетов.
//
//private: закрытый класс или член класса, противоположность модификатору public.
// Закрытый класс или член класса доступен только из кода в том же классе.
//
//protected: такой класс или член класса доступен из любого места в текущем классе или пакете или в производных классах,
// даже если они находятся в других пакетах

public class Program {

    public static void main(String[] args) {

        //Пример использования модификаторов доступа
        Person Grigory = new Person("Grigory", 18, "Lubielska", "+380500474858");

        Grigory.displayName();
        Grigory.displayAge();
        // Grigory.displayAdres();
        Grigory.displayPhone();


        // Инкапсуляция
        HumanEncapsulation hu = new HumanEncapsulation("Monika ", 18);
        System.out.println(hu.getFirstName()+ hu.getFirstAge());
    }
}
