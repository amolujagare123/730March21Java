package CollectionDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol"); // 0
        ll.add("sunny"); //1
        ll.add("Sonali");// 2
        ll.add("Akshay"); //  3
        ll.add("Praful"); // 4
        ll.add("abhijit");  // 5
        ll.add("ritesh");  // 6
        ll.add("ritesh");
        ll.add(null);

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
