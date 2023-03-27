package collections.printingcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintHashMap {
    int age;
    String name;
    PrintHashMap(int a,String n)
    {
        age=a;
        name=n;
    }
    public String toString()
    {
        return age+ " " + " "+name;
    }
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(10,"Shiva");
        for (Map.Entry m : hm.entrySet())
            System.out.println(m.getKey() + " "
                    + m.getValue().toString());

    }

}
