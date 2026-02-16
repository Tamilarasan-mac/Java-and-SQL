public class AssignmentVsComparison {
    public static void main(String[] args) {
        
    boolean flag = false;

        if (flag = true) {   // ⚠ Important Line.   //Assigns true to flag //
            System.out.println("Inside IF Block");
        } else {
            System.out.println("Inside ELSE Block");
        }

    }
}
