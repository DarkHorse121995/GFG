package practice.basics;

public class LCM {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 17;
        int hcf = 1;

        int limit = Math.min(n1,n2);

        for(int i=2; i<=limit ;i++) {
            if (n1 % i== 0 && n2 % i== 0)
                hcf = hcf * i;
        }

        System.out.println("LCM : " + Math.multiplyExact(n1,n2)/hcf);
    }
}
