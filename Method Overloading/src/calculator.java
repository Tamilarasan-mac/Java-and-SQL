class Calculator {

    // Method 1
    int add(int a, int b) {
            return a + b;
    }
     

    // Method 2 (Different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (Different data type)
    double add(double a, double b) {
        return a + b;
    }
}

class OverloadingDemo {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        
        System.out.println(obj.add(99,1));
        System.out.println(obj.add(150,150,200));
        System.out.println(obj.add(25.9,24.9));
        
    }
}