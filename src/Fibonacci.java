import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            System.out.println("Enter a number");
            long a =sc.nextLong();
            System.out.print(a+"th fibonacci is: ");
            System.out.println(fib(a));
        }
    }
    public static long fib(long a){
        if(a==1)return 1;
        if(a==2)return 2;
        return fib(a-1)+fib(a-2);
    }
}
