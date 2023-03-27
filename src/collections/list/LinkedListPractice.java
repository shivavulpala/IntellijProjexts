package collections.list;
import  java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        for(int i=0;i<5;i++)
        {
            ll.add(i);
            System.out.print(ll+ " ");
        }
        System.out.println("\n"+ll);

        ll.remove(3);
        System.out.println(ll);

        ll.add(6);
        System.out.println(ll);

        ll.addFirst(7);
        System.out.println(ll);

        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" ");
        }

    }
}
