package numberseries;

import java.util.Scanner;

public class StrongNumber {
    public static int fact(int a){
        if (a == 1)
            return 1;
        return a * fact(a - 1);
    }
    public static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while (temp > 0){
            int reminder = temp % 10;
            int fact = fact(reminder);
            sum += fact;
            temp /= 10;
        }
        if (sum == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first range : ");
        int first = sc.nextInt();
        System.out.print("Enter the last range : ");
        int second = sc.nextInt();
        for (int i = first; i <= second; i++){
            if (isStrong(i))
                System.out.println(i);
        }
    }
}
