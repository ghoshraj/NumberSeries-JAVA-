package numberseries;

import java.util.Scanner;

public class SpyNumber {
    public static int sum(int a){
        int sum = 0;
        while (a > 0){
            int reminder = a % 10;
            sum+= reminder;
            a /= 10;
        }
        return sum;
    }
    public static int multipication(int a){
        int multipication = 1;
        while (a > 0){
            int reminder = a % 10;
            multipication *= reminder;
            a /= 10;
        }
        return multipication;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
       if (sum(number) == multipication(number))
           System.out.println(number + " is a spy number");
       else
           System.out.println(number + " is not a spy number");
    }
}
