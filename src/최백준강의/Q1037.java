package 최백준강의;

import java.util.Arrays;
import java.util.Scanner;

public class Q1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            list[i] = M;
        }
        Arrays.sort(list);
        System.out.println(list[0] * list[N-1]);
    }
}
