package PART1;

import java.util.Arrays;
import java.util.Scanner;

public class N번째큰수 {
    public static void main(String[] args) {
//        배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
//        배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.
//        첫줄에는 테스트 케이스 개수가 주어진다.

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[10];
        int[] answer = new int[T];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 10; j++) {
                list[j] = sc.nextInt();
            }
            Arrays.sort(list);
            answer[i] = list[7];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }

    }
}
