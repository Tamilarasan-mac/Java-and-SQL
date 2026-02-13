class pubVspri {
    public int Rollno = 2114;   
    private String Name = "Tamilarasan";        //Private in same class
    private void display (){
        System.out.println("Roll no :"+"Rollno");
        System.out.println("Student Name :"+Name);
    }
    public static void main(String []args){
        pubVspri object = new pubVspri();
            object.display();                   //Private Accessible in same class
    }
}

