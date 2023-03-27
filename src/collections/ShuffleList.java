package collections;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Shiva");
        al.add("Hari");
        al.add("Srihan");
        al.add("Sriyan");
        System.out.println("Original List : "+al);
        Collections.reverse(al);
        System.out.println("Reverse List : "+al);
        Collections.shuffle(al);
        System.out.println("Shuffled List : "+al);
        Collections.shuffle(al,new Random(2));
        System.out.println("Shuffled List with Random : "+al);
    }
}
