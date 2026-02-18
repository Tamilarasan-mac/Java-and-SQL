class Dad {
                                                                //Single inheritance
    int money = 7177;
    String name = ("and Rajendran said Spend wisely. ");

        void display()
        {
            System.out.println(money);
            System.out.println(name);
        }
}
class Son extends Dad{
  void display()
  {
    System.out.println("Dad give's money to son Tamilarasan Rupees ");
  }

}
public class Single_inheritance{
    public static void main(String[]args){
       Son s1 = new Son();
         s1.display();
       Dad d1 = new Dad();
        d1.display();
            
    }
}
