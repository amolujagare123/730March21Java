package CollectionDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amol");
        lhs.add("praful");
        lhs.add("Akshay");
        lhs.add("Ritesh");
        lhs.add("Sunny");
        lhs.add("Sonali");
        lhs.add("Abhijeet");
        System.out.println(lhs.add("Abhijeet"));
        System.out.println(lhs);

    }
}
