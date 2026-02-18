import java.util.Scanner;

public class input_score {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);

                String name = scan.nextLine();
                double score = scan.nextDouble();
                scan.nextLine();
                String department = scan.nextLine();
                
                scan.close();
                
            System.out.println("Student Name : " + name);
            System.out.println("Scored : " + score/10 + "/10" );            //input divided by 10
            System.out.println("Department : " + department);
            
             if(score < 5.0){                                     //if statement 
                    System.out.println("Result : Fail");        // if input user give's score above 5.0 and the result is pass
                }                                                  // else below 5.0 fail
                else{
                    System.out.println("Result : Pass");
                }



    }
    
}