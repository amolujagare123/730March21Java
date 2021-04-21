package CollectionDemos;

import java.util.ArrayDeque;

public class ArrayDQueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("amol");
        adq.offer("sunny");
        adq.offer("sonali");
        adq.offer("Akshay");
        adq.offer("praful");

        System.out.println(adq);
      //  System.out.println(adq.poll());

        adq.offerFirst("first");
        adq.offerLast("last");
        System.out.println(adq);

        adq.removeFirst();
        adq.removeLast();

        System.out.println(adq);
    }

}
