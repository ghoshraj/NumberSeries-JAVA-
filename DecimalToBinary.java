package numberseries;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        /*
        logic :
        7 % 2 = 1 && 7 / 2 = 3
        3 % 2 = 1 && 3 / 2 = 1
        1 % 2 = 1 && 1 / 2 = 0
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desimal number : ");
        int desimal = sc.nextInt();
        int binary = 0;
        int i = 1;
        while (desimal > 0){
            int reminder = desimal % 2;
            binary += reminder * i;
            i *= 10;
            desimal /= 2;
        }
        System.out.println(binary);
    }
}
