package 그리디;

import java.util.Scanner;

public class 숫자1이_될_때까지 {
    public static void main(String[] args) {
        // 어떠한 수 N과 K가 주어진다.
        // N을 아래의 연산들을 선택하여 숫자1이 될 때까지 연산을 계속해서 진행한다.
        // 연산의 결과가 숫자1이 되면 연산을 진행할 횟수를 출력한다.
        // 연산 1 : N에서 1을 뺀다.
        // 연산 2 : N을 K로 나눈다.
        // 연산은 반복 또는 중복해서 가능하며 1이 될때까지 진행해야 한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        // 연산을 진행하기 전에 어떤 연산을 거쳐야 할 지 확인
        // N은 K의 배수인가? -> 배수라면 N은 K로 나누어 떨어지므로 연산1을 거칠 필요가 없다.
        // N이 K의 배수가 아니라면 연산1을 거쳐 N을 K의 배수로 만들어줘야 한다.

        while(N != 1){
            if(N % K == 0){
                //N이 K의 배수일 때
                N /= K;
                cnt += 1;
            }else{
                //N이 K의 배수가 아닐 때
                N -= 1;
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }
}
