import java.util.Scanner;
    public class User_Input{
        public static void main(String[]args){

            Scanner scan = new Scanner(System.in);
            
                String Name = scan.nextLine();
                int Age = scan.nextInt();           //if we use int after the String
                scan.nextLine();                    // use this to avoid the int is stored to next String
                String MyAddress = scan.nextLine();

                scan.close();

            System.out.println("My Name is " + Name);
            System.out.println("My Age " + Age);
            System.out.println("My Address is " + MyAddress);


        }
    }
    