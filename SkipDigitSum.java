package numberseries;

import java.util.Scanner;
public class SkipDigitSum {
    public static int sum(int a){
        int sum = 0;
        while (a > 0){
            int reminder = a % 10;
            sum += reminder;
            a /= 100;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.println(sum(number));
    }
}
