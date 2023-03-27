package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>(5);

        for(int i=0;i<5;i++)
        {
            arrayList.add(i);
            System.out.print(arrayList+ " ");
        }
        System.out.println("\n"+arrayList);

        arrayList.remove(3);
        System.out.println(arrayList);

        arrayList.add(6);
        System.out.println(arrayList);

        for(int i=0;i<arrayList.size();i++)
        {
            System.out.print(arrayList.get(i)+" ");
        }

    }
}
