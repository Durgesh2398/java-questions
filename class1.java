import java.util.*;
public class class1{
    public static void main(String[] args){
        PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
        pq.add(2);
        pq.add(1);
        pq.add(9);
        pq.add(7);
        pq.add(8);
        pq.add(6);
        pq.add(3);
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.isEmpty());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.isEmpty());
    }
}