package 구현.완전탐색;

import java.util.Scanner;

public class 시각 {
    public static void main(String[] args) {
        // 정수 N이 주어졌을 때,
        // 0시 0분 0초 부터 N시 59분 59초까지,
        // 정수 3이 포함된 시각의 갯수를 모두 출력해야 함.
        // 숫자 3이 중복된 경우 한번만 카운트(3시 33분 33초)

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        String time = "";
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= 59; j++){
                for(int k = 0; k <= 59; k++){
                    time = i + "" + j + "" + k;
                    if(time.contains("3")){
                        cnt+=1;
                    }

                }
            }
        }

        System.out.println(cnt);
    }
}
