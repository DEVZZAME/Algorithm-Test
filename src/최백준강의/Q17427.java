package 최백준강의;

import java.util.Arrays;
import java.util.Scanner;

public class Q17427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] f = new long[1000001];
        long[] g = new long[1000001];

        Arrays.fill(f, 1);

        for (int i = 2; i < f.length; i++) {
            for (int j = 1; i * j < f.length; j++) {
                f[i*j] += i;
            }
        }

        // g0 = 1
        // g1 =

        for (int i = 1; i < f.length; i++) {
            g[i] = g[i-1] + i;
        }
    }
}
