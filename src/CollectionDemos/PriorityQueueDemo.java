package CollectionDemos;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        pq.offer(11);
        pq.offer(21);
        pq.offer(15);
        pq.offer(31);
        pq.offer(19);
        pq.offer(41);
        pq.offer('v');

        System.out.println(pq);
        // 11, 15, 19 ,21 ,31 , 41
        // some operating systems or compliers doesnot support the priority queue
        // so in printing you dont see the order
        System.out.println(pq.poll()); //11
        System.out.println(pq);
        System.out.println(pq.poll()); //15
        System.out.println(pq);
        System.out.println(pq.poll()); //19
        System.out.println(pq);
        System.out.println(pq.poll()); //21
        System.out.println(pq);
        System.out.println(pq.poll());//31
        System.out.println(pq);
        System.out.println(pq.poll()); //41
        System.out.println(pq);



    }

}
