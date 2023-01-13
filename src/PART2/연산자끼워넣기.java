package PART2;

import java.util.Arrays;
import java.util.Scanner;

public class 연산자끼워넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        int[] op = new int[4];
        int[] op2 = new int[4];
        int big = 0;
        int small = 0;

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);
        big = list[0];
        small = list[0];

        for (int i = 0; i < 4; i++) {
            op[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            op2[i] = op[i];
        }

//        가장 큰 수는 최대한 큰 음수를 만들고, 나눈 다음, 더하고, 곱한다.
        for (int i = 1; i <= N; i++) {
            if (op[1] > 0) {
                big -= list[i];
                op[1] -= 1;
            } else if (op[3] > 0) {
                big /= list[i];
                op[3] -= 1;
            } else if (op[0] > 0) {
                big += list[i];
                op[0] -= 1;
            } else if (op[2] > 0) {
                big *= list[i];
                op[2] -= 1;
            }
        }

//        가장 작은 수는 음수를 최대한 크게 만들어 큰 수와 곱한다.
//        1. 덧셈 2. 나눗셈 3. 빼기 4. 곱하기
        for (int i = 1; i <= N; i++) {
            if (op2[0] > 0) {
                small += list[i];
                op2[0] -= 1;
                System.out.println("덧셈 연산 : " + small);
            } else if (op2[3] > 0) {
                small /= list[i];
                op2[3] -= 1;
                System.out.println("나눗셈 연산 : " + small);
            } else if (op2[1] > 0) {
                small -= list[i];
                op2[1] -= 1;
                System.out.println("뺄셈 연산 : " + small);
            } else if (op2[2] > 0) {
                small *= list[i];
                op2[2] -= 1;
                System.out.println("곱셈 연산 : " + small);
            }
        }

        System.out.println(big);
        System.out.println(small);

    }
}
