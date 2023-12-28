import java.util.*;

public class HashMaping {
    public static void main(String args[]){
       HashMap<String,Integer> map = new HashMap<>();
       // insert in data in hashmap
       map.put("Suraj",24);
       map.put("sagar",33);
       map.put("samir",39);

       System.out.println(map);
       // update 
       map.put("Suraj", 333);
        System.out.println(map);

        // check or search
        if (map.containsKey("Suraj")) {
            System.out.println("key is present in the map");
        }

        // value for key
        System.out.println(map.get("Suraj"));
        System.out.println(map.get("amit"));

        // Iterator
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+":-");
            System.out.println(e.getValue());
        }

       //remove data 
       map.remove("Suraj",333);
       System.out.println(map);
    }
}
