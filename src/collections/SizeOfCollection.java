package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class SizeOfCollection {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(99);
        li.add(54);
        li.add(112);
        li.add(184);
        li.add(2);
        System.out.print(li.size());
        System.out.print(li.isEmpty() +" : Collection is not empty");

        li.clear();
        System.out.println("The new List is: " + li);
        System.out.println("Is the LinkedList empty: " + li.isEmpty());
    }
}
