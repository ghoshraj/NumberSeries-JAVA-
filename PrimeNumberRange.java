package numberseries;

import java.util.Scanner;

public class PrimeNumberRange {
    public static boolean isprime(int a){
        boolean flag = true;
        for (int i = 2 ; i <= a / 2; i++){
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n1 = sc.nextInt();
        for (int i = n ; i <= n1; i++){
            if (isprime(i))
                System.out.println(i);
        }
    }
}
