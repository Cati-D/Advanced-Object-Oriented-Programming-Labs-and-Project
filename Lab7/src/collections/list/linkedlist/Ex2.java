package collections.list.linkedlist;

import java.util.LinkedList;

/**
 * head ---------tail
 *
 */
public class Ex2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.offer("c");//add
        list.offerFirst("rr");

        System.out.println(list.element());//NoSuchElementException if List is empty
 //       new LinkedList<>().element();

        LinkedList<String> empty = new LinkedList<>();
        System.out.println(list.peek());//return first element
        System.out.println(list.poll());//return and remove first element
        System.out.println(list);
        System.out.println(empty.poll());//recomandat

        //from deque
        list.pop();//removeFirst
        System.out.println(list);
        empty.pop();
    }
}
