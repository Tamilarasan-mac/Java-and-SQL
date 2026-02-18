public class Nested_if {
    public static void main (String []args){
        boolean car = true;
        boolean key = true;
        boolean seatbelt = true;

        if(car){

            System.out.println("Open the car door");     //boolean car is true

            if(key){                   //Only if the car is true can the key be used to start the car.And wear the seat belt.

                System.out.println("Use the key to start the car");  //Car is true , So use the key to start the car

                if(seatbelt){               //boolean seatbelt is true

                System.out.println("Use seat belt to drive safety "); //car and key is true , and wear the seatbelt to drive safety

                }
            }

        }

            // So all condition are true ,the nexted if works the all conditions and print the all nested if.
    }       // if any condition is false then nested if stop the program
}
