public class Logical_Operator_Confusion {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        if (x > 5 || y++ > 10) {                        //left side is true
            System.out.println("Inside IF");          //java will NOT check right side
        }                                               // y++ not executed

        System.out.println("y value: " + y);
    }
    
}
