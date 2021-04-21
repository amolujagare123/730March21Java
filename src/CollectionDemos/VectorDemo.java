package CollectionDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("amol"); // 0
        v.add("sunny"); //1
        v.add("Sonali");// 2
        v.add("Akshay"); //  3
        v.add("Praful"); // 4
        v.add("abhijit");  // 5
        v.add("ritesh");  // 6
        v.add("ritesh");
        v.add(null);

        System.out.println(v);

        System.out.println(v.contains("sunny123"));

       Object[] obj =  v.toArray();

        System.out.println("Printing the array");

        for(int i=0;i< obj.length;i++)
            System.out.println(obj[i]);

        System.out.println("Printing the elements using enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

        System.out.println("First Element="+v.firstElement());
        System.out.println("Last Element="+v.lastElement());
    }
}
