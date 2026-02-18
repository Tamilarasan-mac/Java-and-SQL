import java.util.Scanner;

public class int_scan {
    public static void main (String[]args){
         Scanner scan = new Scanner(System.in);

                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                int d = (a*b*c);                      // user gives the input for a,b,c and the three values are multiply here
                int e = (a+b+c);                      // a,b,c values are addition here
                                                      
                scan.close();
                
        System.out.println("Result = " + d/e);        // d and e are divide here , so multiplied and additioned values are
    }                                                 // divided here and user give's the input and System give's you output 
    
}
