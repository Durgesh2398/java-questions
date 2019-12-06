import java.util.*;
class graphSm{
    HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
    boolean addVertex(int vertex){
        if(!graph.containsKey(vertex)){
            graph.put(vertex, new HashSet<>());
            return true;
        }
        return false;
    }
    void addEdge(int u,int v){
        HashSet<Integer> neighbor = graph.get(u);
        graph.get(u).add(v);
        //neighbor.add(v);
        //graph.put(u, neighbor);
        graph.get(v).add(u);
        //neighbor=graph.get(v);
        //neighbor.add(u);
        //graph.put(v,neighbor);
    }
    
    void BFS(int s){
        System.out.println("===---BFS---===");
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited.add(s);
        while(!q.isEmpty()){
            s = q.poll();
            System.out.print(s+" ");
            for(Integer n: graph.get(s)){
                if(!visited.contains(s)){
                    q.add(n);
                    visited.add(n);
                }
            }
        }
        System.out.println();
    }

    
    void print(){
        System.out.println(graph.keySet());
        for(Integer key:graph.keySet()){
            System.out.println("Adjacency list of nodes : "+key);
            System.out.println(graph.get(key));
        }
    }
}
public class graphImp{
    public static void main(String[] args){
        graphSm g= new graphSm();
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 4);
        g.addEdge(5, 0);
        g.BFS(0);
        System.out.println();
        g.print();
    }
}