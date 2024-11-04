package numberseries;

import java.util.Scanner;

public class Palindrome_Number {
    public static boolean ispalindrome(int a){
        int temp = a;
        int ans = 0;
        while (temp > 0){
            int reminder = temp % 10;
            ans = (ans * 10) + reminder;
            temp /= 10;
        }
        if (ans == a)
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
            if (ispalindrome(i))
                System.out.println(i);
        }
    }
}
