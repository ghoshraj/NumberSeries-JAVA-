package numberseries;

import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int a){
        int count = count(a);
        int ans = a * a;
        int product = 1;
        for (int i = 1; i <= count; i++){
            product = product * 10;
        }
        if (ans % product == a)
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
            if (isAutomorphic(i))
                System.out.println(i);
        }
    }
}
