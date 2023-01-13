package PART1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[9];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            int N = sc.nextInt();
            list[i] = N;
            total += N;
        }

        for(int i = 0; i < 9; i++){
            for (int j = 1; j < 9; j++) {
                if(total - list[i] - list[j] == 100){
                    list[i] = 0;
                    list[j] = 0;
                    Arrays.sort(list);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(list[k]);
                    }
                    return;
                }
            }
        }
    }
}
