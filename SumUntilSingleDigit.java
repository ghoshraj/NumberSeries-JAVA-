package numberseries;

class HelloWorld {
    public static int Ans(int n){
        int sum = 0;
        while(n > 0){
            int reminder = n % 10;
            sum += reminder;
            n /= 10;
        }
        if(sum > 9)
            return Ans(sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 345;
        System.out.println(Ans(n));
    }
}