package numberseries;

import java.util.Scanner;

public class Sum_Of_Digit {
    public static void sum(int a){
        int sum = 0;
        while (a > 0){
            int reminder = a % 10;
            sum+= reminder;
            a /= 10;
        }
        System.out.println("The sum of the digit is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        sum(number);
    }
}
