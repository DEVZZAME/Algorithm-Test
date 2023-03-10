package 그리디;

import java.util.Scanner;

public class 거스름돈03 {
    public static void main(String[] args) {
        // 춘향이는 편의점 카운터에서 일한다.
        // 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다.
        // 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다.
        // 동전의 개수가 최소가 되도록 거슬러 주어야 한다.
        // 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
        // 예를 들어, 거스름돈이 15원이면 5원짜리 3개를,
        // 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를,
        // 거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
        // 첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다.
        // 거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //입력 받은 거스름돈
        int cnt = 0;

        while(num > 0){

            //5원으로 나누어질 경우
            if(num % 5 == 0){
                cnt = cnt + (num / 5);
                break;
            }

            //5원으로 나누어지지 않을 경우
            //2원으로 나누었을 때 양수일 경우
            num -= 2;
            cnt += 1;

            //2원으로 나누었을 때 음수일 경우
            if(num < 0){
                cnt = -1;
            }
        }

        System.out.println(cnt);

    }
}
