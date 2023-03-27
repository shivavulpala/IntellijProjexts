package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElements {
    public static void main(String[] args) {
        try {
            ArrayList<String> al = new ArrayList<>();
            al.add("Shiva");
            al.add("Hari");
            al.add("Srihan");
            al.add("Sriyan");
            System.out.println(al);
            Collections.rotate(al,2);
            System.out.println(al);
            al.set(0, "Priya");
            System.out.println(al);
            al.set(6, "Love");
        }
    catch (Exception e) {

            // Display the exception on the console
            System.out.println(e);
        }
    }
}
