import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String args[]){
     // creating hashsets 
        HashSet<Integer> set = new HashSet<>();
       // insert/add in hashset 
       set.add(1);
       set.add(5);
       set.add(5);
   
       // search / contains 
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contains 6");
        }
        
        // remove / delete 
        set.remove(1);
            // print the size of set 
        System.out.println("size of set is: "+set.size());
         // print all set values 
         System.out.println(set);
         // iterator 
          Iterator it = set.iterator();

          while (it.hasNext()) {
             System.out.println(it.next());
          }
    }
}
