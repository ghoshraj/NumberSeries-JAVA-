package numberseries;

import java.util.Scanner;

public class First_N_Even_Number {
    public static boolean iseven(int a){
        if (a % 2 == 0)
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
            if (iseven(i))
                System.out.println(i);
        }
    }
}
