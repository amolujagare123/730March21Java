package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();

        al.add(23);
        al.add(13);
        al.add(33);
        al.add(25);
        al.add(63);

        System.out.println("al="+al);

        ArrayList<Integer> al2  = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);



    }
}
