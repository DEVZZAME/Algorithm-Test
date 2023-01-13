package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 큰_수의_법칙 {
    public static void main(String[] args) {
        // 특정 숫자로 이루어진 배열이 있다.
        // 각 배열을 M번 더해서 가장 큰 수를 만들어야 한다.
        // 단, 특정 인덱스의 수를 K번 초과해서 더할 수는 없다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);
        int first = list[n - 1];
        int second = list[n - 2];

        //M번 더해야 함, K초과 안됨
        while(m > 0){
            answer = answer + (first * k);
            m = m - k;
            answer = answer + second;
            m = m - 1;
        }

        System.out.println(answer);


    }
}
