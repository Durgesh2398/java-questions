import java.util.*;
class LinkedMain{
    Node head;
    //1st
    class Node{
        int data;
        Node next;
        Node(int d){
            data= d;
            next = null;
        }
    }
    //2nd
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
    //3rd
    public void insertAtStart(int data){
        Node node = new Node(data);
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    //4th
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
    //5th
    public void show(){
        Node node= head;
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println("");
    }
    //6th
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
            System.out.print("The middle element is [" + slow_ptr.data + "] \n"); 
        } 
    }
    //7th
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
    //8th
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
    //9th
    public void reverse(){
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
    }
}
public class LinkedList{
    public static void main(String[] args){
        LinkedMain list = new LinkedMain();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.show();

        System.out.println("Insert at start :");
        list.insertAtStart(10);
        list.show();
        
        System.out.println("Insert at index 2 :");
        list.insertAt(2, 45);
        list.show();
        
        System.out.println("Insert at index 4 :");
        list.insertAt(4, 100);
        list.show();
        
        System.out.println("Insert at index 0 :");
        list.insertAt(0, 12);
        list.show();
        
        System.out.println("Delete by index 2 :");
        list.delete(2);
        list.show();
        
        System.out.println("Print middle element");
        list.printMiddle();
        
        list.show();
        System.out.println("Delete middle element");
        list.deleteMid();
        list.show();

        System.out.println("before reverse");
        list.show();
        System.out.println("after reverse");
        list.reverse();
        list.show();
    }
}