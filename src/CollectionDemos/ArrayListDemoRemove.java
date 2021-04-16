package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemoRemove {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();

        al.add(23);
        al.add(13);
        al.add(33);
        al.add(25);
        al.add(63);

        System.out.println("al="+al);

       // al.remove(new Integer(23));

        al.remove(3);
        System.out.println("al="+al);



    }
}
