package 구현.시뮬레이션;

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        // 여행가 A는 N x N 크기의 정사각형 공간 위에 서 있다.
        // 이 공간은 1 x 1 크기의 정사각형으로 나누어져 있다.
        // 좌측 상단의 좌표는 (1, 1), 우측 하단의 좌표는 (N, N)이다.
        // 여행의 시작지점은 항상 (1, 1)이다.
        // L(왼쪽으로 한 칸 이동)
        // R(오른쪽으로 한 칸 이동)
        // U(위로 한 칸 이동)
        // D(아래로 한 칸 이동)
        // L, R, U, D으로 이루어진 여행계획서가 주어졌을 때,
        // 여행가 A가 최종적으로 도착할 여행지의 좌표를 출력해야 한다.
        // 단, N x N의 공간 밖으로 이동하는 경우는 무시한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 1;
        int y = 1;

        String str = sc.next();
        // 여행계획서가 담긴 배열 생성
        String[] plan = str.split("");
        char[] direction = {'L', 'R', 'U', 'D'};

        for(int i = 0; i < plan.length; i++){
            // 방향과 이동해야 할 좌표 확인하기
            if(plan[i].charAt(0) == direction[0]){
                x -= 1;
                if(x == 0){
                    x += 1;
                }
            }else if(plan[i].charAt(0) == direction[1]){
                x += 1;
                if(x > N){
                    x -= 1;
                }
            }else if(plan[i].charAt(0) == direction[2]){
                y -= 1;
                if(y == 0){
                    y += 1;
                }
            }else if(plan[i].charAt(0) == direction[3]){
                y += 1;
                if(y > N){
                    y -= 1;
                }
            }
            System.out.println(plan[i].charAt(0) + " - " + i);
        }

        System.out.printf("%d %d", y, x);
    }
}
