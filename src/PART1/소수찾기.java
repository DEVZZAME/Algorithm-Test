package PART1;

import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
//        주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int input_number = sc.nextInt();
            if (is_prime(input_number) == 1) {
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }

    static int is_prime(int number) {
//        0을 리턴하면 소수가 아님, 1을 리턴하면 소수가 맞음
//        입력 받은 값이 2보다 작을 경우는 소수가 아님
        if (number < 2) {
            return 0;
        }
//        입력 받은 값이 2인 경우는 소수가 맞음
        if (number == 2) {
            return 1;
        }
//        입력 받은 값이 자기 자신을 제외한 수로 나누어 떨어지면 소수가 아님
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
