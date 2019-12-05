import java.util.LinkedList;
import java.util.*;
class graph{
    int v;
    LinkedList<Integer> adjListArray[];
    graph(int v){
        this.v=v;
        adjListArray= new LinkedList[v];
        for(int i=0;i<v;i++){
            adjListArray[i] = new LinkedList<>();
        }
    }
    void addEdge(int a , int b){
        adjListArray[a].add(b);
        adjListArray[b].add(a); //Because Undirectional Graph
    }
    void print(){
        for(int i=0;i<v;i++){
            System.out.println("Adjacency List of : "+i);
            for(Integer x:adjListArray[i]){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    void BFS(int s){
        System.out.println("===---BFS---===");
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty()){
            s = q.poll();
            System.out.println(s+" ");
            for(Integer n: adjListArray[s]){
                if(!visited[n]){
                    q.add(n);
                    visited[n]=true;
                }
            }
        }
        System.out.println();
    }
}
public class graph1{
    public static void main(String[] args){
        graph g = new graph(5);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(0,2);
    //    g.addEdge(0,3);
    //    g.addEdge(3,1);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.print();
        g.BFS(0);
    }
}