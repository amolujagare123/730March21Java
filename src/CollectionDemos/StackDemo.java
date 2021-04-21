package CollectionDemos;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        System.out.println(s.empty());// true

        s.push(12);//6
        s.push(22);//5
        s.push(13);//4
        s.push(32);//3
        s.push(16);//2
        s.push(82);//1
        System.out.println(s.empty());// false

        System.out.println(s);

       // System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s);

        System.out.println(s.search(22));


    }

}
