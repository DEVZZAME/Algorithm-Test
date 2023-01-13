package PART1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
//        두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
//        첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
//        첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int G = GCD(N, M);

        System.out.println(G);
        System.out.println((N*M)/G);
    }

    static int GCD(int n1, int n2){
        if (n1 % n2 == 0) return n2;
        else return GCD(n2, n1 % n2);
    }
}
