public class overloading {

        // Method       
    void sum (int a , int b)
    {
        
        System.out.println(a + b);
    }
        // Method 2 ( Same method but parameters must be different )
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }


    public static void main(String[] args) throws Exception {

                overloading obj1 = new overloading();
                    obj1.sum(10,90);
                    obj1.sum(10,20,30);
            
    }
}
