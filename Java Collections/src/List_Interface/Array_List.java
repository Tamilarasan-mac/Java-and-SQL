package List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List{
        public static void main(String[] args){

            List<String> name1 = new ArrayList<>();

             name1.add("Tamil");
             name1.add("Ak");
             name1.add("Sk");
             name1.add(null);       // null values allowed
             name1.add(null);

             List<String> name2 = new ArrayList<>();

                name2.add("King");
                name2.add("Akash");
                name2.add("Dinesh");


name1.addAll(name2); // addAll for, one collection all elements add inside the list

            Iterator<String> it = name1.iterator();
            while(it.hasNext()) {

                System.out.println("To check name1 and name2 addAll : "+it.next()); //iterator loop


            }
        }
    }