package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();

        al.add(23);
        al.add(13);
        al.add(33);
        al.add(25);
        al.add(63);

        System.out.println("al="+al);

        ArrayList<Integer> al2  = new ArrayList<>();

        al2.add(23);
        al2.add(13);
        al2.add(33);
        al2.add(113);
        al2.add(131);
        al2.add(331);

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);

        al2.clear();

        System.out.println("al2="+al2);
    }
}
