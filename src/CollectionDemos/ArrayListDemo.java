package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al  = new ArrayList();

        al.add("amol"); // 0
        al.add("sunny"); //1
        al.add("Sonali");// 2
        al.add("Akshay"); //  3
        al.add("Praful"); // 4
        al.add("abhijit");  // 5
        al.add("ritesh");  // 6
        al.add("ritesh");
        al.add(3);
        al.add(4.4);
        al.add('c');

        System.out.println(al);
        System.out.println("size="+al.size());

        for(int i = 0 ; i<al.size();i++)
        System.out.println(al.get(i));



    }
}
