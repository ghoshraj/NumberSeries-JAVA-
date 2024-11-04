package numberseries;

import java.util.Scanner;

public class Calculator_Call {
    public static void add(int a , int b){
        int sum = a + b;
        System.out.println("sum of " + a + " and " + b + " is : " + sum);
    }
    public static void multipication(int a , int b){
        int multipication = a * b;
        System.out.println("multipication of " + a + " and " + b + " is : " + multipication);
    }
    public static void division(int a , int b){
        int division = a / b;
        System.out.println("division of " + a + " and " + b + " is : " + division);
    }
    public static void substraction(int a , int b){
        int substraction = a - b;
        System.out.println("substraction of " + a + " and " + b + " is : " + substraction);
    }
    public static void modulus(int a , int b){
        int modulus = a % b;
        System.out.println("modulus of " + a + " and " + b + " is : " + modulus);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        add(n1,n2);
        modulus(n1,n2);
        substraction(n1,n2);
        division(n1,n2);
        multipication(n1,n2);
    }
}
