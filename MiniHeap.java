
import java.util.*;
class MiniIntHeap{
    int arr[]=new int[10];
    int size=0;

    //1st
    int getParentIndex(int index){
        return (index-1)/2;
    }

    //2nd
    int getLeftChildindex(int index){
        return 2*index+1;
    }

    //3rd
    int getRightChildindex(int index){
        return 2*index+2;
    }

    //4th
    boolean hasParent(int index){
        if(getParentIndex(index)>=0)
        return true;
        return false;
    }

    //5th
    boolean hasLeftChild(int index){
        return (getLeftChildindex(index)<size);
    }

    //6th
    boolean hasRightChild(int index){
        return (getRightChildindex(index)<size);
    }

    //7th
    int parent(int index){
        return arr[getParentIndex(index)];
    }

    //8th
    int LeftChild(int index){
        return arr[getLeftChildindex(index)];
    }

    //9th
    int RightChild(int index){
        return arr[getRightChildindex(index)];
    }

    //10th
    int size(){
        return size;
    }

    //11th
    int getPeek(){
        return arr[0];
    }

    //12th
    boolean isEmpty(){
        return size<=0;
    }

    //13th
    void insert(int val){
        arr[size]=val;
        size++;
        HeapifyUp();
    }

    //14th
    void swap(int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    //15th
    void HeapifyUp(){
        int index=size-1;
        while(hasParent(index) && parent(index)>arr[index]){
            swap(index,getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    //16th
    void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    //17th
    int poll(){
        int var =arr[0];
        arr[0]=arr[size-1];
        size--;
        HeapifyDown();
        return var;
    }

    //18th
    void HeapifyDown(){
        int index =0;
        while(hasLeftChild(index)){
            int greaterChildIndex = getLeftChildindex(index);
            if(hasRightChild(index) && RightChild(index)<LeftChild(index)){
                greaterChildIndex = getRightChildindex(index);
            }
            if(arr[index]>arr[greaterChildIndex]){
                swap(index,greaterChildIndex);
            }
            else{
                break;
            }
            index = greaterChildIndex;
        }
    }
}
public class MiniHeap{
    public static void main(String[] args) {
        MiniIntHeap obj = new MiniIntHeap();
        obj.insert(10);
        obj.insert(100);
        obj.insert(5);
        obj.insert(8);
        obj.insert(40);
        obj.insert(70);
        obj.insert(20);
        obj.print();
        obj.poll();
        obj.print();
    }
}