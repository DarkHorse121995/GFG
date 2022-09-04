package practice.basics;

public class NeonNumber {
    /*
    * N = 9
    * N*N = 9*9 = 81 -> 8+1 = 9
    * So, 9  is NEON number
    */

    public static void main(String[] args) {
        int N = 100;
        int n = 0;
        int r = 0;
        int sum = 0;

        for(int i=1 ; i<=N ; i++){
            n = i*i;
            sum = 0;
            while(n>0){
                r = n%10;
                sum = sum + r;
                n = n/10;
            }

            if(sum == i)
                System.out.println(i);
        }
    }
}
