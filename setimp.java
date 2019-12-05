import java.util.*;
public class setimp{
    public static void main(String[] args){
        HashSet<Integer> set  = new HashSet<>();
        set.add(5);
        set.add(9);
        set.add(3);
        set.add(4);
        for(Integer x:set){
            System.out.println(x+" ");
        }
        // System.out.println();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        // System.out.println(set.contains(5));
        // System.out.println(set.remove(6));
        // System.out.println(set.contains(5));
        // System.out.println(set.remove(6));
        // //System.out.println(set.clear());
        // set.clear();
        // System.out.println(set.isEmpty());
        // System.out.println(set.size());
        
    }
}