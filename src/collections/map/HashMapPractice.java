package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"Hari");
        hm.put(2,"Sriyan");
        hm.put(3,"Shiva");
        hm.put(4,"Srihan");

        System.out.println(hm.get(1));
        System.out.println(hm);//hm
        System.out.println(hm.entrySet());//hm.entrySet()

        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
