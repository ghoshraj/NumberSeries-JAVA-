package numberseries;

import java.util.Scanner;

public class DigitFactorial {
    public static int fact(int a){
        if (a == 1)
            return 1;
        return a * fact(a - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int nuber = sc.nextInt();
        int temp = nuber;
        int sum = 0;
        while (temp > 10){
            int reminder = temp % 10;
            int fact = fact(reminder);
            sum += fact;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
