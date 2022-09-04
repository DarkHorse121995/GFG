package practice.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestNumberOf3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        if(x>=y && x>=z)
            System.out.println(x + " is largest");
        else if(y>=x && y>=z)
            System.out.println(y + " is largest");
         else
             System.out.println(z + " is largest");



    }
}
