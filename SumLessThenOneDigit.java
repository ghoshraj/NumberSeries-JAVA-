package numberseries;

import java.util.Scanner;

public class SumLessThenOneDigit {
    public static int sum(int n){
        int a;
        int sum = 0;
        while (n > 0){
            a = n % 10;
            sum = sum + a;
            n = n /10;
            if (n == 0 && sum > 9){
                System.out.println(sum);
                n = sum;
                sum = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(19));
    }
}
