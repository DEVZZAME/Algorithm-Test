package 최백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        long[] f = new long[1000001];
        long[] g = new long[1000001];

        Arrays.fill(f, 1);

        for (int i = 2; i < f.length; i++) {
            for (int j = 1; i * j < f.length; j++) {
                f[i*j] += i;
            }
        }


        for (int i = 1; i < f.length; i++) {
            g[i] = g[i-1] + f[i];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(g[N]).append("\n");
        }
        System.out.println(sb);
    }
}
