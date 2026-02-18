public class AssignmentVsComparison {
    public static void main(String[] args) {
        
    boolean flag = false;

        if (flag = true) {   // ⚠ Important Line   //Assigns true to flag not comparison == // So condition is true //returns true //If block executes.
            System.out.println("Inside IF Block");
        } else {
            System.out.println("Inside ELSE Block");
        }

    }
}
