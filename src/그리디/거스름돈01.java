package 그리디;

import java.util.Scanner;

public class 거스름돈01 {
    public static void main(String[] args) {
        // 거스름돈 num을 입력 받아, 500원, 100원, 50원, 10원의 잔돈으로 거슬러 줄 때, 최소 동전 개수 구하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //입력 받은 거스름돈
        int cnt = 0; //거슬러 줄 동전 개수
        int[] exchange = {500, 100, 50, 10};

        for (int i = 0; i < exchange.length; i++) {
            cnt = cnt + (num / exchange[i]);
            num = num % exchange[i];
        }
        System.out.println(cnt);
    }
}
