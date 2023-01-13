package PART1;

import java.util.Scanner;

public class 피보나치수5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
    }

    static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
