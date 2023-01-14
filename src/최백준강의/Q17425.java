package 최백준강의;

import java.util.Scanner;

public class Q17425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long gn = 0;

        for (int i = 1; i <= N; i++) {
            gn += (N / i) * i;
        }
        System.out.println(gn);
    }
}
