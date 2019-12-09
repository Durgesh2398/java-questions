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
    public void insertAtStart(int data){
        Node node = new Node(data);
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    public void insertAt(int index,int data){
        Node node = new Node(data);
        node.data=data;
        node.next=null;
        if(index ==0){
            insertAtStart(data);
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void show(){
        Node node= head;
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println("");
    }
    void printMiddle() 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + slow_ptr.data + "] \n"); 
        } 
    }
    void delete(int position) 
    { 
        if (head == null) 
            return; 
        Node temp = head; 
        if (position == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        } 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
        Node next = temp.next.next; 
        temp.next = next;  // Unlink the deleted node from list 
    }
    public void deleteMid()  
    {  
        Node slow_ptr = head;  
        Node fast_ptr = head;  
        Node prev = null;  
        while (fast_ptr != null && fast_ptr.next != null)  
        {  
            fast_ptr = fast_ptr.next.next;  
            prev = slow_ptr;  
            slow_ptr = slow_ptr.next;  
        }  
        prev.next = slow_ptr.next;   
    } 
}
public class LinkedList{
    public static void main(String[] args){
        LinkedMain list = new LinkedMain();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.show();
        list.insertAtStart(10);
        list.show();
        list.insertAt(2, 45);
        list.show();
        list.insertAt(4, 100);
        list.show();
        list.insertAt(0, 12);
        list.show();
        list.delete(2);
        list.show();
        list.printMiddle();
        list.deleteMid();
        list.show();
    }
}