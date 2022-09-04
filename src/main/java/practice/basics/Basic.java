package practice.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic {
    public static void main(String[] args) {
//        new Basic().method(null);

        try {
            addTwoBinaryStrings();
        }catch (IOException e){
            e.printStackTrace();
        }



    }

    public static void addTwoBinaryStrings() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String b1 = bufferedReader.readLine();
        String b2 = bufferedReader.readLine();
        int totalDecimal = Integer.parseInt(b1,2) + Integer.parseInt(b2,2);
        System.out.println(totalDecimal);
        System.out.println(Integer.toBinaryString(totalDecimal));

    }

    public void method(Object o){}
//    public void method(String  o){}
    public void method(int[] o){System.out.println("Array");}
}
