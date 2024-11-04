package numberseries;

import java.util.Scanner;

public class Do_While_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number : ");
            int number = sc.nextInt();
            if (number % 10 == 0)
                break;
            System.out.println(number);
        }while (true);
    }
}
