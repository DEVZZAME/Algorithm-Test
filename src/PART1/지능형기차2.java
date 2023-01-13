package PART1;

import java.util.Arrays;
import java.util.Scanner;

public class 지능형기차2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][2];
        int[] ppl = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            if (i == 0) {
                ppl[0] = arr[0][1];
            }else{
                ppl[i] = ppl[i-1] + arr[i][1] - arr[i][0];
            }
        }
        Arrays.sort(ppl);
        System.out.println(ppl[9]);
    }
}
