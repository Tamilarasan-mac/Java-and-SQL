public abstract class Animal{
    abstract void sound();
    void sleep()
    {
        System.out.println("Animal is Sleeping");
    }
}
    class Dog extends Animal{
         void sound()
         {
            System.out.println("Dog Barks");
         }
        }


        class Main {

                public static void main (String[]args){
                
                    Animal a = new Dog();
                        a.sleep();
                        a.sound();

                
        } 
    }



    