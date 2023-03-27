package collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionToArray {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Shiva");
        al.add("Hari");
        al.add("Sriyan");
        al.add("Srihan");
        System.out.println(al);
        String[] str=al.toArray(new String[0]);
        for(int i=0;i<str.length;i++)
        {
            String data=str[i];
            System.out.print(data + " ");
        }
    }
}
