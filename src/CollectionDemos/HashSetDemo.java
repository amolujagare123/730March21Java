package CollectionDemos;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("amol");
        hs.add("praful");
        hs.add("Akshay");
        hs.add("Ritesh");
        hs.add("Sunny");
        hs.add("Sonali");
        hs.add("Abhijeet");
        System.out.println(hs.add("Abhijeet"));
        System.out.println(hs);

    }
}
