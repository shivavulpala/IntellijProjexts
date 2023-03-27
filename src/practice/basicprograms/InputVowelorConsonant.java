package practice.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class InputVowelorConsonant
{
    public static void main(String[] args)
    {
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:");
        input = sc.next().charAt(0);
        if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||
                input=='A'||input=='E'||input=='I'||input=='O'||input=='U')
                System.out.println(input + " is a vowel");
        else
                System.out.println(input + " is a consonant");

    }
}
