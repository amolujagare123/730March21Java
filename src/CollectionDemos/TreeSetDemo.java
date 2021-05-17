package CollectionDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> lhs = new TreeSet<>();

        lhs.add("Amol");
        lhs.add("Praful");
        lhs.add("Akshay");
        lhs.add("Ritesh");
        lhs.add("Sunny");
        lhs.add("Sonali");
        lhs.add("Abhijeet");

        System.out.println(lhs.add("Abhijeet"));
        System.out.println(lhs);

    }
}
