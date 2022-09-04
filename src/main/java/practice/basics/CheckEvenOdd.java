package practice.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckEvenOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int no = Integer.parseInt(bufferedReader.readLine());

        if ((no % 2) == 0)
            System.out.println(no + " is Even.");
        else
            System.out.println(no + " is Odd.");
    }
}
