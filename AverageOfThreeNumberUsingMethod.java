package numberseries;

import java.util.Scanner;


public class AverageOfThreeNumberUsingMethod {
    public  static void average(int a , int b , int c){
        int avg = (a + b + c)/3;
        System.out.println("The average of "+ a + " , " + b + " , " + c + " is : " + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();
        average(n1,n2,n3);
    }
}
