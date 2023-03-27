package collections.sortedset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> t=new TreeSet<>();
        t.add("Shiva");
        t.add("Sriyan");
        t.add("Srihan");
        t.add("Hari");
        t.add("Sriyan");


        Iterator<String> i=t.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
    }
}
