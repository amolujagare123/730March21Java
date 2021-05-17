package CollectionDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(101,"Amol");
        tm.put(323,"Avi");
        tm.put(123,"Arnav");
        tm.put(401,"Sachin");
        tm.put(112,"Sunny");
        tm.put(13,"Sonali");
        tm.put(30,"Ritesh");
        tm.put(532,"Abhjeet");
        tm.put(613,"Praful");

        System.out.println("hm="+tm);

    }
}
