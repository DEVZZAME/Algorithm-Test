package 구현.시뮬레이션;

import java.util.Scanner;

public class 왕실의_나이트 {
    public static void main(String[] args) {
        // 행복 왕국의 왕실 정원은 체스판과 같은 8 x 8 좌표 평면이다.
        // 왕실 정원의 특정한 한 칸에 나이트가 서 있다.
        // 나이트는 매우 충성스러운 신하로서 매일 무술을 연마한다.
        // 나이트는 말을 타고 있기 때문에 이동을 할 때는 L자 형태로만 이동한다.
        // 나이트는 정원 밖으로 나갈 수 없다.
        // 나이트는 특정한 위치에서 아래와 같은 2가지 경우로 이동할 수 있다.
        // 1. 수평으로 두칸 이동한 뒤에 수직으로 한칸 이동
        // 2. 수직으로 두칸 이동한 뒤에 수평으로 한 칸 이동
        // 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램을 작성하라.
        // 행의 좌표는 1부터 8로 표현되고, 열의 좌표는 a부터 h로 표현된다.

        // 나이트 위치 입력 받기
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();

        // 나이트 위치 정수로 치환
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;
        int cnt = 0;

        // 나이트가 이동할 수 있는 경우의 수 코드 작성
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + dx[i];
            int newColumn = column + dy[i];
            if (newRow >= 1 && newRow <= 8 && newColumn >= 1 && newColumn <= 8) {
                cnt += 1;
            }
        }

        // 나이트가 실제로 이동할 수 있는 경우의 수 출력
        System.out.println(cnt);
    }
}
