import java.util.*;
public class mapimp{
    public static void main(String[] args){
        HashMap<Integer,String> map= new HashMap<>();
        map.put(0,"Audi");
        map.put(1,"BMW");
        map.put(2, "Jaguar");
        map.put(3,"Alto");
        System.out.println(map.get(3));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.remove(2));
        System.out.println(map.containsKey(2));
        map.put(3, "Tesla");
        System.out.println(map.get(3));
    }
}