package CollectionDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println(hm.isEmpty()); // true

        hm.put(101,"Amol");
        hm.put(323,"Avi");
        hm.put(123,"Arnav");
        hm.put(401,"Sachin");
        hm.put(112,"Sunny");
        hm.put(13,"Sonali");
        hm.put(30,"Ritesh");
        hm.put(532,"Abhjeet");
        hm.put(613,"Praful");
        System.out.println("Size="+hm.size());
        System.out.println(hm.isEmpty());  // false
        System.out.println("hm="+hm);

       /* hm.put(101,"Ashish");

        System.out.println(hm);*/
        HashMap<Integer,String> hm1 = new HashMap<>();
        System.out.println("hm1="+hm1);
        hm1.putAll(hm);
        System.out.println("hm1="+hm1);

        System.out.println(hm.get(401));

        hm.remove(401);
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(321));
        System.out.println(hm.containsValue("Sonali1"));

        hm.clear();
        System.out.println("hm="+hm);

    }
}
