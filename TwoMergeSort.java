import java.util.*;
class LinkedMain{
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next =null;
        }
    }
    public void insert(int data){
        Node node = new Node(data);
        node.data=data;
        if(head==null){
            head= node;
        }
        else{
            Node n =head;
            while(n.next!=null){
                n=n.next;
            }
            n.next =node;
        }
    }
    public void show(){
        Node node= head;
        while(node!=null){
            System.out.print("->"+node.data+" ");
            node = node.next;
        }
        System.out.println("");
    }
    Node head;
    static Node mergeSort(Node h1, Node h2) 
    { 
        if (h1 == null) 
            return h2; 
        if (h2 == null) 
            return h1; 
        if (h1.data < h2.data) { 
            h1.next = mergeSort(h1.next, h2); 
            return h1; 
        } 
        else { 
            h2.next = mergeSort(h1, h2.next); 
            return h2; 
        } 
    }
}
public class TwoMergeSort{
    public static void main(String[] args){
        LinkedMain list1 = new LinkedMain();
        LinkedMain list2 = new LinkedMain();
        list1.insert(2);
        list1.insert(4);
        list1.insert(20);
        list1.insert(27);
        list1.insert(100);
        list2.insert(3);
        list2.insert(10);
        list2.insert(15);
        list2.insert(25);
        list2.insert(35);
        System.out.println("First list");
        list1.show();
        System.out.println("Second list");
        list2.show();
        list1.mergeSort(list1.head,list2.head);
        System.out.println("answer by recurison");
        list1.show();
    }
}