package numberseries;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static int fact(int a){
        if (a == 1)
            return 1;
        return a * fact(a - 1);
    }
    public static void main(String[] args) {
        // c = n! / r! * (n - r)!
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter another number : ");
        int r = sc.nextInt();
        int ans = fact(n) /( fact(r) * fact(n - r));
        System.out.println(ans);
    }
}
