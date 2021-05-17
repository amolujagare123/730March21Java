package CollectionDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"Amol");
        hm.put(323,"Avi");
        hm.put(123,"Arnav");
        hm.put(401,"Sachin");
        hm.put(112,"Sunny");
        hm.put(13,"Sonali");
        hm.put(30,"Ritesh");
        hm.put(532,"Abhjeet");
        hm.put(613,"Praful");

        System.out.println("hm="+hm);

        Set s = hm.keySet();
        System.out.println("Set s = "+s);

        Collection c = hm.values();
        System.out.println("Collection c = "+c);

        Set entrySet =  hm.entrySet();
        System.out.println("entrySet = "+entrySet);

    }
}
