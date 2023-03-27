package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElementsInCollection {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(3);
        li.add(5);
        li.add(18);
        li.add(4);
        li.add(6);
        System.out.println("List = "+li);
        Collections.sort(li);
        System.out.println(li);
       int  min=Collections.min(li);
        int max=Collections.max(li);
        if(min==max)
            System.out.println("All elements are equal");
        else
        {
            System.out.println("Minimum value " + min);
            System.out.println("Maximum value " + max);
        }


    }
}
