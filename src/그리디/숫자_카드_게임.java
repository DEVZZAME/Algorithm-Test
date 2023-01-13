package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자_카드_게임 {
    public static void main(String[] args) {
        // 숫자 카드 게임은 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임.
        // 숫자가 쓰인 카드들이 N x M 형태로 놓여 있음(N은 행, M은 열)
        // 먼저 뽑고 싶은 카드가 포함된 행을 선택
        // 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑음

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] card = new int[n][m];
        int[] picked = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                card[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            Arrays.sort(card[i]);
            picked[i] = card[i][0];
        }

        Arrays.sort(picked);
        int answer = picked[n - 1];
        System.out.println(answer);

    }
}
