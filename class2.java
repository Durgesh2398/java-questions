import java.util.*;
class PriorityQueueApp{
    int arr[]=new int[10];
    int nItems =0;
    public void insert(int val){
        if(nItems==0){
            arr[0]=val;
            nItems++;
            return;
        }
        int i;
        for(i=nItems-1;i>=0;i--){
            if(arr[i]>val){
                arr[i+1]=arr[i];
            }
            else{
                break;
            }
        }
        arr[i+1]=val;
        nItems++;
    }
    public int remove(){
        return arr[--nItems];
        // int val = arr[nItems-1];
        // nItems--;
        // return val;
    }
    public boolean isEmpty(){
        // if(nItems==0){
        //     return true;
        // }
        // return false;
        return nItems == 0;
    }
    public int size(){
        return nItems;
    }
    public int getPeek(){
        return arr[nItems-1];
    }
    public void print(){
        for(int i=0;i<nItems;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
public class class2{
    public static void main(String[] args){
        PriorityQueueApp pq = new PriorityQueueApp();
        pq.insert(2);
        pq.insert(1);
        pq.insert(9);
        pq.insert(7);
        pq.insert(6);
        pq.insert(5);
        pq.insert(4);
        pq.print();
        System.out.println("");
        pq.remove();
        pq.print();
        System.out.println(pq.size());
        System.out.println(pq.getPeek());
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
}