package practice.basics;

import java.util.ArrayList;
import java.util.List;

public class ListAllPrimeNumbers {
    public static void main(String[] args) {
        int N = 1;
        Boolean status = true;
        List<Integer> primeNumberList = new ArrayList<>();
        if(N>=2)
            primeNumberList.add(2);

        for(int i=3 ; i<=N ; i+=2){
            status = true;
            if(i==3 || i==5) {
                primeNumberList.add(i);
            }
            else {
                for (int j=3; j<=i/2; j+=2) {
                    if (i % j == 0) {
                        status = false;
                        break;
                    }
                }
                if(status)
                    primeNumberList.add(i);
            }
        }

        System.out.println(primeNumberList);

    }
}
