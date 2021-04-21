package CollectionDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {
       // Vector has default initial capacity as 10.
        Vector<String> v = new Vector<>();
        System.out.println("Capacity="+v.capacity());// 10
        System.out.println("Size="+v.size());// 0

        v.add("amol"); // 0
        v.add("sunny"); //1
        v.add("Sonali");// 2
        v.add("Akshay"); //  3
        v.add("Praful"); // 4
        v.add("abhijit");  // 5
        v.add("ritesh");  // 6
        v.add("ritesh"); // 7
        v.add(null); // 8
        v.add("Sonali");
        v.add("Sonali123");
        v.add("sunny"); //1
        v.add("Sonali");// 2
        v.add("Akshay"); //  3
        v.add("Praful"); // 4
        v.add("abhijit");  // 5
        v.add("ritesh");  // 6
        v.add("ritesh"); // 7
        v.add(null); // 8
        v.add("Sonali");
        v.add("Sonali123");

        System.out.println(v);

        System.out.println("Capacity="+v.capacity());// 20
        System.out.println("Size="+v.size());// 21




    }
}
