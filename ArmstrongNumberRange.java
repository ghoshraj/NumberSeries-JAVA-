package numberseries;

import java.util.Scanner;

public class ArmstrongNumberRange {
    public  static  boolean isArmstrong(int a){
        int temp = a;
        int count = count(a);
        int sum = 0;
        while (temp > 0){
            int reminder = temp % 10;
            int ans = 1;
            for (int i = 1; i <= count; i++){
                ans = ans * reminder;
            }
            sum += ans;
            temp /= 10;
        }
        if (sum == a)
            return true;
        return false;
    }
    public static int count(int a){
        int count = 0;
        while (a > 0){
            count++;
            a /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first range : ");
        int first = sc.nextInt();
        System.out.print("Enter the last range : ");
        int second = sc.nextInt();
        for (int i = first; i <= second; i++){
            if (isArmstrong(i))
                System.out.println(i);
        }
    }
}
