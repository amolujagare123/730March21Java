package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemoSet {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();

        System.out.println(al.isEmpty());// true

        al.add(23); // 0
        al.add(13); // 1
        al.add(33); // 2
        al.add(25);
        al.add(63);

        System.out.println(al.isEmpty());// false

        System.out.println("al="+al);

        al.set(2,89);

        System.out.println("al="+al);

    }
}
