package numberseries;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect(int a){
        int sum = 0;
        for (int i = 1; i <= a/2; i++){
            if(a % i == 0)
                sum += i;
        }
        if (sum == a)
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
            if (isPerfect(i))
                System.out.println(i);
        }
    }
}
