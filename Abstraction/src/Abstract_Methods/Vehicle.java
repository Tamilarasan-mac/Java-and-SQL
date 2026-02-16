package Abstract_Methods;

abstract  class Vehicle {
    abstract void speed ();
    }
    class Brand extends Vehicle{
        void speed()
        {
            System.out.println("Lamborghini");
        }
    }
    class Bike extends Vehicle{
        void speed()
        {
            System.out.println("80 km/h");
        }
    }
    class  Car extends Vehicle{
        void speed()
        {
            System.out.println("150 km/h");
        }
    }
    
     class main{
        public static void main(String[]args){
              Vehicle obj0 = new Brand();
              obj0.speed();
              Vehicle obj1 = new Bike();
              obj1.speed();
              Vehicle obj2 = new Car();
              obj2.speed();
        }

    }



 