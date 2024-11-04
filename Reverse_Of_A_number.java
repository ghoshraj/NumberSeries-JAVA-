package numberseries;

import java.util.Scanner;

public class Reverse_Of_A_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int ans = 0;

        while (number > 0){
            int i = 10;
           int reminder = number % 10;
            ans = (ans * i) + reminder;
           // i *= 10;
            number = number /10;
        }
        System.out.println(ans);
    }
}
