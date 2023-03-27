package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Shiva");
        lhs.add("Hari");
        lhs.add("Srihan");
        lhs.add("Hari");
        lhs.add("Sriyan");
        lhs.add("Shiva");

        Iterator<String> i= lhs.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
    }
}
