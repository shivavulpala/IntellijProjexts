package collections;
import java.util.*;

public class ArrayToCollection {
    public static void main(String[] args) {
        String names[] = { "Virat", "Sachin", "Rohit", "Bumrah" };
        // printing input elements for comparison
        System.out.println("Array input: " + Arrays.toString(names));

        // converting array into Collection with asList() function
        List namesList = Arrays.asList(names);

        // print converted elements
        System.out.println("Converted elements: " + namesList);
    }
}
