package CollectionDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(101,"Amol");
        lhm.put(323,"Avi");
        lhm.put(123,"Arnav");
        lhm.put(401,"Sachin");
        lhm.put(112,"Sunny");
        lhm.put(13,"Sonali");
        lhm.put(30,"Ritesh");
        lhm.put(532,"Abhjeet");
        lhm.put(613,"Praful");

        System.out.println("hm="+lhm);

    }
}
