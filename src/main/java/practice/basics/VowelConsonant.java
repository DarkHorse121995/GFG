package practice.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class VowelConsonant {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char ch = bufferedReader.readLine().charAt(0);
        approach1(ch);
        approach2(ch);

    }

    private static void approach2(char ch) {
        List<Character> vowels = List.of('A','a','E','e','I','i','O','o','U','u');
        if(vowels.contains(ch))
            System.out.println(ch + " is VOWEL");
        else
            System.out.println(ch + " is CONSONANT");

    }

    private static void approach1(char ch) {

        String s = "AEIOUaeiou";
        if(s.indexOf(ch) != -1)
            System.out.println(ch + " is VOWEL");
        else
            System.out.println(ch + " is CONSONANT");
    }
}
