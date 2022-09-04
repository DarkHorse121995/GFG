package practice.basics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int N = 1000;
        int sum = 0;
        int r = 0;
        int n = 0;

        for(int i=1 ; i<=N ; i++){
            n = i;
            sum = 0;
            while(n>0){
                r = n%10;
                sum = sum + r*r*r;
                n = n/10;
            }

            if(sum == i)
                System.out.println(i);
        }
    }
}
