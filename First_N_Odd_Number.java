package numberseries;

import java.util.Scanner;

public class First_N_Odd_Number {
    public static boolean isodd(int a){
        if (a % 2 != 0)
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
            if (isodd(i))
                System.out.println(i);
        }
    }
}
