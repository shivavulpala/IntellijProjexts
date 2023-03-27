package collections;

import java.util.Hashtable;
import java.util.Vector;

public class ProgWOCollectionFrameWork {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};
        Vector<Integer> v=new Vector();//vector methods are final, their size cant be changed
        Hashtable<Integer,String> h=new Hashtable();//key,value

        v.addElement(7);
        v.addElement(9);

        h.put(2,"Shiva");
        h.put(7,"Hari");


        System.out.println(array[4]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));
        System.out.println(h.get(3));
        System.out.println(v.elementAt(1));
    }

}
