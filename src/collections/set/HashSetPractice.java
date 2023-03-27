package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("Hari");
        h.add("Srihan");
        h.add("Hari");
        h.add("Sriyan");
        h.add("");//allows null elements
        h.add("Shiva");
        System.out.println(h);
        //traversing elements
        Iterator<String> i= h.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
    }
}
