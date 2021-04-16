package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();

        al.add(23);
        al.add(13);
        al.add(33);
        al.add(25);
        al.add(63);
      //  al.add("amol");

        System.out.println(al);

        Iterator itr = al.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());





    }
}
