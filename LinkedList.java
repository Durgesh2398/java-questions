import java.util.*;
class LinkedMain{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data= d;
            next = null;
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
            System.out.println(node.data);
            node = node.next;
        }
    }
}
public class LinkedList{
    public static void main(String[] args){
        LinkedMain list = new LinkedMain();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.show();

    }
}