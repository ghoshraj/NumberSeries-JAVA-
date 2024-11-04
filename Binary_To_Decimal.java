package numberseries;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        /*
        logic :
        101 --> 1 * 2^0 + 0 * 2^1 + 1 * 2^2;
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int binary = sc.nextInt();
        int pow = 0;
        int decnum = 0;
        while (binary > 0){
            int reminder = binary % 10;
           decnum += reminder * (int) Math.pow(2,pow);
           pow++;
            binary /= 10;
        }
        System.out.println(decnum);
    }
}
