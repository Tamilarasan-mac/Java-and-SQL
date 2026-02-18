public class else_If {                           
    public static void main(String[]args){        //if condition checks the conditions with logical && operator
        int score = 61;

        if(score > 30 && score < 60){                    //score 61 > 30 true , score 61 < 60 false , So 'if' checks next condition
            System.out.println("Video Game");          // and output not printed 
        }                                                   
        else if(score > 60 && score < 85){               //score 61 > 60 true , score 61 < 85 true , and program stopped , and out printed
            System.out.println("Apple I phone");      // Beacuse 'else if' have true and 'else if' stopped next condition
        }
        else if(score > 85){
            System.out.println("Macbook M5 Pro");
        }

                            

    }
}
