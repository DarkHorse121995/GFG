package practice.basics;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 2020;

        if(year % 400 == 0)
            System.out.println(year + " : LEAP YEAR");
        else if(year % 100 == 0)
            System.out.println(year + " : NOT LEAP YEAR");
        else if(year % 4 == 0)
            System.out.println(year + " : LEAP YEAR");
        else
            System.out.println(year + " : NOT LEAP YEAR");

    }
}
