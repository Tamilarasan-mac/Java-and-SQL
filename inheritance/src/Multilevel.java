class Animal {
    void eat()
    {
        System.out.println("Domestic Animals");
    }
}

class Dog extends Animal{                               //Dog class extends Animal class
    void bark()
    {
        System.out.println("Dogs are barking");
    }
}
class cat extends Dog{                                  //cat class ectends dog class
    void meow()
    {
        System.out.println("Meow cat");
    }
}

public class Multilevel{
    public static void main(String[]args){
            cat c1 = new cat();
                c1.eat();
                c1.bark();
                c1.meow();
    }
}













