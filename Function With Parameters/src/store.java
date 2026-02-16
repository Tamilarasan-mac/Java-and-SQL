public class store {

void chocolate(int money)
{
    System.out.println(money);
    System.out.println("Chocolate Purchased");
}
void powder(int money)
{
     System.out.println(money);  
    System.out.println("Powder Purchased");
}


    public static void main(String[] args) throws Exception {
        
        store obj1 = new store();

        obj1.chocolate(5);
        obj1.powder(20);


    }
}